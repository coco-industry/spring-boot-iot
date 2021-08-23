package com.yunqiic.iot.db.service;

import com.yunqiic.iot.db.dao.IotOrderGoodsMapper;
import com.yunqiic.iot.db.domain.IotOrderGoods;
import com.yunqiic.iot.db.domain.IotOrderGoodsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IotOrderGoodsService {
    @Resource
    private IotOrderGoodsMapper orderGoodsMapper;

    public int add(IotOrderGoods orderGoods) {
        orderGoods.setAddTime(LocalDateTime.now());
        orderGoods.setUpdateTime(LocalDateTime.now());
        return orderGoodsMapper.insertSelective(orderGoods);
    }

    public List<IotOrderGoods> queryByOid(Integer orderId) {
        IotOrderGoodsExample example = new IotOrderGoodsExample();
        example.or().andOrderIdEqualTo(orderId).andDeletedEqualTo(false);
        return orderGoodsMapper.selectByExample(example);
    }

    public List<IotOrderGoods> findByOidAndGid(Integer orderId, Integer goodsId) {
        IotOrderGoodsExample example = new IotOrderGoodsExample();
        example.or().andOrderIdEqualTo(orderId).andGoodsIdEqualTo(goodsId).andDeletedEqualTo(false);
        return orderGoodsMapper.selectByExample(example);
    }

    public IotOrderGoods findById(Integer id) {
        return orderGoodsMapper.selectByPrimaryKey(id);
    }

    public void updateById(IotOrderGoods orderGoods) {
        orderGoods.setUpdateTime(LocalDateTime.now());
        orderGoodsMapper.updateByPrimaryKeySelective(orderGoods);
    }

    public Short getComments(Integer orderId) {
        IotOrderGoodsExample example = new IotOrderGoodsExample();
        example.or().andOrderIdEqualTo(orderId).andDeletedEqualTo(false);
        long count = orderGoodsMapper.countByExample(example);
        return (short) count;
    }

    public boolean checkExist(Integer goodsId) {
        IotOrderGoodsExample example = new IotOrderGoodsExample();
        example.or().andGoodsIdEqualTo(goodsId).andDeletedEqualTo(false);
        return orderGoodsMapper.countByExample(example) != 0;
    }

    public void deleteByOrderId(Integer orderId) {
        IotOrderGoodsExample example = new IotOrderGoodsExample();
        example.or().andOrderIdEqualTo(orderId).andDeletedEqualTo(false);
        orderGoodsMapper.logicalDeleteByExample(example);
    }
}
