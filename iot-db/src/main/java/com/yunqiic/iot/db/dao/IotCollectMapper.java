package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotCollect;
import com.yunqiic.iot.db.domain.IotCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    long countByExample(IotCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int deleteByExample(IotCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int insert(IotCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int insertSelective(IotCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    IotCollect selectOneByExample(IotCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    IotCollect selectOneByExampleSelective(@Param("example") IotCollectExample example, @Param("selective") IotCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    List<IotCollect> selectByExampleSelective(@Param("example") IotCollectExample example, @Param("selective") IotCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    List<IotCollect> selectByExample(IotCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    IotCollect selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    IotCollect selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    IotCollect selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotCollect record, @Param("example") IotCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotCollect record, @Param("example") IotCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_collect
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}