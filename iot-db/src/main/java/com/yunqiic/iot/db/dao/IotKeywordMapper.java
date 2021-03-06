package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotKeyword;
import com.yunqiic.iot.db.domain.IotKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    long countByExample(IotKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int deleteByExample(IotKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int insert(IotKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int insertSelective(IotKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    IotKeyword selectOneByExample(IotKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    IotKeyword selectOneByExampleSelective(@Param("example") IotKeywordExample example, @Param("selective") IotKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    List<IotKeyword> selectByExampleSelective(@Param("example") IotKeywordExample example, @Param("selective") IotKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    List<IotKeyword> selectByExample(IotKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    IotKeyword selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    IotKeyword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    IotKeyword selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotKeyword record, @Param("example") IotKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotKeyword record, @Param("example") IotKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_keyword
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}