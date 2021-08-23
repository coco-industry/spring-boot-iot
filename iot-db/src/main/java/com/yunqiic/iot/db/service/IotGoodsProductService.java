package com.yunqiic.iot.db.service;

import com.yunqiic.iot.db.dao.GoodsProductMapper;
import com.yunqiic.iot.db.dao.IotGoodsProductMapper;
import com.yunqiic.iot.db.domain.IotGoodsProduct;
import com.yunqiic.iot.db.domain.IotGoodsProductExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IotGoodsProductService {
    @Resource
    private IotGoodsProductMapper iotGoodsProductMapper;
    @Resource
    private GoodsProductMapper goodsProductMapper;

    public List<IotGoodsProduct> queryByGid(Integer gid) {
        IotGoodsProductExample example = new IotGoodsProductExample();
        example.or().andGoodsIdEqualTo(gid).andDeletedEqualTo(false);
        return iotGoodsProductMapper.selectByExample(example);
    }

    public IotGoodsProduct findById(Integer id) {
        return iotGoodsProductMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        iotGoodsProductMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(IotGoodsProduct goodsProduct) {
        goodsProduct.setAddTime(LocalDateTime.now());
        goodsProduct.setUpdateTime(LocalDateTime.now());
        iotGoodsProductMapper.insertSelective(goodsProduct);
    }

    public int count() {
        IotGoodsProductExample example = new IotGoodsProductExample();
        example.or().andDeletedEqualTo(false);
        return (int) iotGoodsProductMapper.countByExample(example);
    }

    public void deleteByGid(Integer gid) {
        IotGoodsProductExample example = new IotGoodsProductExample();
        example.or().andGoodsIdEqualTo(gid);
        iotGoodsProductMapper.logicalDeleteByExample(example);
    }

    public int addStock(Integer id, Short num){
        return goodsProductMapper.addStock(id, num);
    }

    public int reduceStock(Integer id, Short num){
        return goodsProductMapper.reduceStock(id, num);
    }

    public void updateById(IotGoodsProduct product) {
        product.setUpdateTime(LocalDateTime.now());
        iotGoodsProductMapper.updateByPrimaryKeySelective(product);
    }
}