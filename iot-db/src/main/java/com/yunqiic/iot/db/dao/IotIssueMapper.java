package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotIssue;
import com.yunqiic.iot.db.domain.IotIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotIssueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    long countByExample(IotIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int deleteByExample(IotIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int insert(IotIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int insertSelective(IotIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    IotIssue selectOneByExample(IotIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    IotIssue selectOneByExampleSelective(@Param("example") IotIssueExample example, @Param("selective") IotIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    List<IotIssue> selectByExampleSelective(@Param("example") IotIssueExample example, @Param("selective") IotIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    List<IotIssue> selectByExample(IotIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    IotIssue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    IotIssue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    IotIssue selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotIssue record, @Param("example") IotIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotIssue record, @Param("example") IotIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_issue
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}