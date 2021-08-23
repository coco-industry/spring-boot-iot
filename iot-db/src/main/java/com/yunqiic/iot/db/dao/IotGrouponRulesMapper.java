package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotGrouponRules;
import com.yunqiic.iot.db.domain.IotGrouponRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(IotGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(IotGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int insert(IotGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(IotGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    IotGrouponRules selectOneByExample(IotGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    IotGrouponRules selectOneByExampleSelective(@Param("example") IotGrouponRulesExample example, @Param("selective") IotGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    List<IotGrouponRules> selectByExampleSelective(@Param("example") IotGrouponRulesExample example, @Param("selective") IotGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    List<IotGrouponRules> selectByExample(IotGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    IotGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    IotGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    IotGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotGrouponRules record, @Param("example") IotGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotGrouponRules record, @Param("example") IotGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}