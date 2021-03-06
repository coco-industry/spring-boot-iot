package com.yunqiic.iot.db.dao;

import com.yunqiic.iot.db.domain.IotGoodsSpecification;
import com.yunqiic.iot.db.domain.IotGoodsSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotGoodsSpecificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    long countByExample(IotGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int deleteByExample(IotGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int insert(IotGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int insertSelective(IotGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    IotGoodsSpecification selectOneByExample(IotGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    IotGoodsSpecification selectOneByExampleSelective(@Param("example") IotGoodsSpecificationExample example, @Param("selective") IotGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    List<IotGoodsSpecification> selectByExampleSelective(@Param("example") IotGoodsSpecificationExample example, @Param("selective") IotGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    List<IotGoodsSpecification> selectByExample(IotGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    IotGoodsSpecification selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") IotGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    IotGoodsSpecification selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    IotGoodsSpecification selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IotGoodsSpecification record, @Param("example") IotGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IotGoodsSpecification record, @Param("example") IotGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IotGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IotGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") IotGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iot_goods_specification
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}