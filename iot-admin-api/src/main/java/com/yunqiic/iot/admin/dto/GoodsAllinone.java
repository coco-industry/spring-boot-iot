package com.yunqiic.iot.admin.dto;

import com.yunqiic.iot.db.domain.IotGoods;
import com.yunqiic.iot.db.domain.IotGoodsAttribute;
import com.yunqiic.iot.db.domain.IotGoodsProduct;
import com.yunqiic.iot.db.domain.IotGoodsSpecification;

public class GoodsAllinone {
    IotGoods goods;
    IotGoodsSpecification[] specifications;
    IotGoodsAttribute[] attributes;
    IotGoodsProduct[] products;

    public IotGoods getGoods() {
        return goods;
    }

    public void setGoods(IotGoods goods) {
        this.goods = goods;
    }

    public IotGoodsProduct[] getProducts() {
        return products;
    }

    public void setProducts(IotGoodsProduct[] products) {
        this.products = products;
    }

    public IotGoodsSpecification[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(IotGoodsSpecification[] specifications) {
        this.specifications = specifications;
    }

    public IotGoodsAttribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(IotGoodsAttribute[] attributes) {
        this.attributes = attributes;
    }

}
