package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotAdmin;
import com.yunqiic.iot.db.domain.IotAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    long countByExample(IotAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int deleteByExample(IotAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int insert(IotAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int insertSelective(IotAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    IotAdmin selectOneByExample(IotAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    IotAdmin selectOneByExampleSelective(@Param("example") IotAdminExample example, @Param("selective") IotAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    List<IotAdmin> selectByExampleSelective(@Param("example") IotAdminExample example, @Param("selective") IotAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    List<IotAdmin> selectByExample(IotAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    IotAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    IotAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    IotAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotAdmin record, @Param("example") IotAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotAdmin record, @Param("example") IotAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}