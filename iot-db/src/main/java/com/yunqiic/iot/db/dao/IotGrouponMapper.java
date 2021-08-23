package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotGroupon;
import com.yunqiic.iot.db.domain.IotGrouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotGrouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    long countByExample(IotGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int deleteByExample(IotGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int insert(IotGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int insertSelective(IotGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    IotGroupon selectOneByExample(IotGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    IotGroupon selectOneByExampleSelective(@Param("example") IotGrouponExample example, @Param("selective") IotGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    List<IotGroupon> selectByExampleSelective(@Param("example") IotGrouponExample example, @Param("selective") IotGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    List<IotGroupon> selectByExample(IotGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    IotGroupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    IotGroupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    IotGroupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotGroupon record, @Param("example") IotGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotGroupon record, @Param("example") IotGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}