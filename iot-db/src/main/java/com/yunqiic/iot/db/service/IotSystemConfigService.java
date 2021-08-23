package com.yunqiic.iot.db.service;

import com.yunqiic.iot.db.dao.IotSystemMapper;
import com.yunqiic.iot.db.domain.IotSystem;
import com.yunqiic.iot.db.domain.IotSystemExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IotSystemConfigService {
    @Resource
    private IotSystemMapper systemMapper;

    public Map<String, String> queryAll() {
        IotSystemExample example = new IotSystemExample();
        example.or().andDeletedEqualTo(false);

        List<IotSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> systemConfigs = new HashMap<>();
        for (IotSystem item : systemList) {
            systemConfigs.put(item.getKeyName(), item.getKeyValue());
        }

        return systemConfigs;
    }

    public Map<String, String> listMail() {
        IotSystemExample example = new IotSystemExample();
        example.or().andKeyNameLike("iot_mall_%").andDeletedEqualTo(false);
        List<IotSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(IotSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listWx() {
        IotSystemExample example = new IotSystemExample();
        example.or().andKeyNameLike("iot_wx_%").andDeletedEqualTo(false);
        List<IotSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(IotSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listOrder() {
        IotSystemExample example = new IotSystemExample();
        example.or().andKeyNameLike("iot_order_%").andDeletedEqualTo(false);
        List<IotSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(IotSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listExpress() {
        IotSystemExample example = new IotSystemExample();
        example.or().andKeyNameLike("iot_express_%").andDeletedEqualTo(false);
        List<IotSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(IotSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public void updateConfig(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            IotSystemExample example = new IotSystemExample();
            example.or().andKeyNameEqualTo(entry.getKey()).andDeletedEqualTo(false);

            IotSystem system = new IotSystem();
            system.setKeyName(entry.getKey());
            system.setKeyValue(entry.getValue());
            system.setUpdateTime(LocalDateTime.now());
            systemMapper.updateByExampleSelective(system, example);
        }

    }

    public void addConfig(String key, String value) {
        IotSystem system = new IotSystem();
        system.setKeyName(key);
        system.setKeyValue(value);
        system.setAddTime(LocalDateTime.now());
        system.setUpdateTime(LocalDateTime.now());
        systemMapper.insertSelective(system);
    }
}
