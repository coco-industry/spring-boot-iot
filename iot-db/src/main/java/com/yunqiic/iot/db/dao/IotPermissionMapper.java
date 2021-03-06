package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotPermission;
import com.yunqiic.iot.db.domain.IotPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    long countByExample(IotPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int deleteByExample(IotPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int insert(IotPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int insertSelective(IotPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    IotPermission selectOneByExample(IotPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    IotPermission selectOneByExampleSelective(@Param("example") IotPermissionExample example, @Param("selective") IotPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    List<IotPermission> selectByExampleSelective(@Param("example") IotPermissionExample example, @Param("selective") IotPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    List<IotPermission> selectByExample(IotPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    IotPermission selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    IotPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    IotPermission selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotPermission record, @Param("example") IotPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotPermission record, @Param("example") IotPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}