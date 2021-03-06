package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotAd;
import com.yunqiic.iot.db.domain.IotAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotAdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    long countByExample(IotAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int deleteByExample(IotAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int insert(IotAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int insertSelective(IotAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    IotAd selectOneByExample(IotAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    IotAd selectOneByExampleSelective(@Param("example") IotAdExample example, @Param("selective") IotAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    List<IotAd> selectByExampleSelective(@Param("example") IotAdExample example, @Param("selective") IotAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    List<IotAd> selectByExample(IotAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    IotAd selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    IotAd selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    IotAd selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotAd record, @Param("example") IotAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotAd record, @Param("example") IotAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_ad
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}