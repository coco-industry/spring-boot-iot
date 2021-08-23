package com.yunqiic.iot.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.yunqiic.iot.admin.util.Permission;
import com.yunqiic.iot.admin.util.PermissionUtil;
import com.yunqiic.iot.admin.vo.PermVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PermissionTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        final String basicPackage = "com.yunqiic.iot.admin";
        List<Permission> permissionList = PermissionUtil.listPermission(context, basicPackage);
        List<PermVo> permVoList = PermissionUtil.listPermVo(permissionList);
        permVoList.stream().forEach(System.out::println);
    }
}
