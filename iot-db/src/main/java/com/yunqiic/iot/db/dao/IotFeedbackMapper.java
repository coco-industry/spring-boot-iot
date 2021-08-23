package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotFeedback;
import com.yunqiic.iot.db.domain.IotFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    long countByExample(IotFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int deleteByExample(IotFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int insert(IotFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int insertSelective(IotFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    IotFeedback selectOneByExample(IotFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    IotFeedback selectOneByExampleSelective(@Param("example") IotFeedbackExample example, @Param("selective") IotFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    List<IotFeedback> selectByExampleSelective(@Param("example") IotFeedbackExample example, @Param("selective") IotFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    List<IotFeedback> selectByExample(IotFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    IotFeedback selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    IotFeedback selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    IotFeedback selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotFeedback record, @Param("example") IotFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotFeedback record, @Param("example") IotFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}