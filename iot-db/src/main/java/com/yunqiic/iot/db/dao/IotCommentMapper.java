package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotComment;
import com.yunqiic.iot.db.domain.IotCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    long countByExample(IotCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int deleteByExample(IotCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int insert(IotComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int insertSelective(IotComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    IotComment selectOneByExample(IotCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    IotComment selectOneByExampleSelective(@Param("example") IotCommentExample example, @Param("selective") IotComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    List<IotComment> selectByExampleSelective(@Param("example") IotCommentExample example, @Param("selective") IotComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    List<IotComment> selectByExample(IotCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    IotComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    IotComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    IotComment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotComment record, @Param("example") IotCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotComment record, @Param("example") IotCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_comment
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}