package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotUser;
import com.yunqiic.iot.db.domain.IotUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    long countByExample(IotUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int deleteByExample(IotUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int insert(IotUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int insertSelective(IotUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    IotUser selectOneByExample(IotUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    IotUser selectOneByExampleSelective(@Param("example") IotUserExample example, @Param("selective") IotUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    List<IotUser> selectByExampleSelective(@Param("example") IotUserExample example, @Param("selective") IotUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    List<IotUser> selectByExample(IotUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    IotUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    IotUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    IotUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotUser record, @Param("example") IotUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotUser record, @Param("example") IotUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_user
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}