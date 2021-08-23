package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotRegion;
import com.yunqiic.iot.db.domain.IotRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    long countByExample(IotRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int deleteByExample(IotRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int insert(IotRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int insertSelective(IotRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    IotRegion selectOneByExample(IotRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    IotRegion selectOneByExampleSelective(@Param("example") IotRegionExample example, @Param("selective") IotRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    List<IotRegion> selectByExampleSelective(@Param("example") IotRegionExample example, @Param("selective") IotRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    List<IotRegion> selectByExample(IotRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    IotRegion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    IotRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotRegion record, @Param("example") IotRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotRegion record, @Param("example") IotRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotRegion record);
}