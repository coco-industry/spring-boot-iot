package com.yunqiic.iot.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.yunqiic.iot.core.qcode.QCodeService;
import com.yunqiic.iot.db.domain.IotGoods;
import com.yunqiic.iot.db.service.IotGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CreateShareImageTest {
    @Autowired
    QCodeService qCodeService;
    @Autowired
    IotGoodsService iotGoodsService;

    @Test
    public void test() {
        IotGoods good = iotGoodsService.findById(1181010);
        qCodeService.createGoodShareImage(good.getId().toString(), good.getPicUrl(), good.getName());
    }
}
