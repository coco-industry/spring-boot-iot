package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotFootprint;
import com.yunqiic.iot.db.domain.IotFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    long countByExample(IotFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(IotFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int insert(IotFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int insertSelective(IotFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    IotFootprint selectOneByExample(IotFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    IotFootprint selectOneByExampleSelective(@Param("example") IotFootprintExample example, @Param("selective") IotFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    List<IotFootprint> selectByExampleSelective(@Param("example") IotFootprintExample example, @Param("selective") IotFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    List<IotFootprint> selectByExample(IotFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    IotFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    IotFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    IotFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotFootprint record, @Param("example") IotFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotFootprint record, @Param("example") IotFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}