package com.yunqiic.iot.wx;

import com.yunqiic.iot.core.util.JacksonUtil;
import com.yunqiic.iot.db.domain.RideOrderKvPo;
import org.junit.Test;

public class JacksonUtilTest {
    @Test
    public void test() {
        String data = "{\"cancelOrderAmount\":\"0\"}";
        RideOrderKvPo.SNAP_CANCEL snap = null;
        snap = JacksonUtil.parseObject(data, RideOrderKvPo.SNAP_CANCEL.class);
        if(snap != null) {
            System.out.println(snap.getCancelOrderAmount());
        }
    }
}
