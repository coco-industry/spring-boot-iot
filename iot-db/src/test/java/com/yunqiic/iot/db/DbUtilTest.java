package com.yunqiic.iot.db;

import org.junit.Test;
import com.yunqiic.iot.db.util.DbUtil;

import java.io.File;

public class DbUtilTest {
    @Test
    public void testBackup() {
        File file = new File("test.sql");
        DbUtil.backup(file, "iot", "iot123456", "iot");
    }

//    这个测试用例会重置iot数据库，所以比较危险，请开发者注意
//    @Test
    public void testLoad() {
        File file = new File("test.sql");
        DbUtil.load(file, "iot", "iot123456", "iot");
    }
}
