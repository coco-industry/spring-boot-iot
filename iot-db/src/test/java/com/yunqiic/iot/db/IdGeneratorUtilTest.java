package com.yunqiic.iot.db;

import com.yunqiic.iot.db.util.IdGeneratorUtil;
import org.junit.Test;

public class IdGeneratorUtilTest {
    @Test
    public void test() {
        System.out.println(IdGeneratorUtil.getLongGuid());
    }
}
