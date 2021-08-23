package com.yunqiic.iot.wx.service;

import com.yunqiic.iot.db.domain.IotUser;
import com.yunqiic.iot.db.service.IotUserService;
import com.yunqiic.iot.wx.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserInfoService {
    @Autowired
    private IotUserService userService;


    public UserInfo getInfo(Integer userId) {
        IotUser user = userService.findById(userId);
        Assert.state(user != null, "用户不存在");
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(user.getNickname());
        userInfo.setAvatarUrl(user.getAvatar());
        return userInfo;
    }
}
