package com.yunqiic.iot.wx.web;

import com.yunqiic.iot.wx.service.IotToftService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Iot服务
 */
@RestController
@RequestMapping("/wx/iottoft")
@Validated
public class WxIotToftController {
    private final Log logger = LogFactory.getLog(WxIotToftController.class);

    @Autowired
    private IotToftService iotToftService;

    /**
     * 获取可用服务
     *
     * @return 可用服务数据
     */
    @GetMapping("getAvailableService")
    public Object getAvailableService() {
        return iotToftService.getAvailableService();
    }
}
