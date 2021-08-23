package com.yunqiic.iot.db.service;

import com.yunqiic.iot.db.dao.IotPermissionMapper;
import com.yunqiic.iot.db.domain.IotPermission;
import com.yunqiic.iot.db.domain.IotPermissionExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class IotPermissionService {
    @Resource
    private IotPermissionMapper permissionMapper;

    public Set<String> queryByRoleIds(Integer[] roleIds) {
        Set<String> permissions = new HashSet<String>();
        if(roleIds.length == 0){
            return permissions;
        }

        IotPermissionExample example = new IotPermissionExample();
        example.or().andRoleIdIn(Arrays.asList(roleIds)).andDeletedEqualTo(false);
        List<IotPermission> permissionList = permissionMapper.selectByExample(example);

        for(IotPermission permission : permissionList){
            permissions.add(permission.getPermission());
        }

        return permissions;
    }


    public Set<String> queryByRoleId(Integer roleId) {
        Set<String> permissions = new HashSet<String>();
        if(roleId == null){
            return permissions;
        }

        IotPermissionExample example = new IotPermissionExample();
        example.or().andRoleIdEqualTo(roleId).andDeletedEqualTo(false);
        List<IotPermission> permissionList = permissionMapper.selectByExample(example);

        for(IotPermission permission : permissionList){
            permissions.add(permission.getPermission());
        }

        return permissions;
    }

    public boolean checkSuperPermission(Integer roleId) {
        if(roleId == null){
            return false;
        }

        IotPermissionExample example = new IotPermissionExample();
        example.or().andRoleIdEqualTo(roleId).andPermissionEqualTo("*").andDeletedEqualTo(false);
        return permissionMapper.countByExample(example) != 0;
    }

    public void deleteByRoleId(Integer roleId) {
        IotPermissionExample example = new IotPermissionExample();
        example.or().andRoleIdEqualTo(roleId).andDeletedEqualTo(false);
        permissionMapper.logicalDeleteByExample(example);
    }

    public void add(IotPermission iotPermission) {
        iotPermission.setAddTime(LocalDateTime.now());
        iotPermission.setUpdateTime(LocalDateTime.now());
        permissionMapper.insertSelective(iotPermission);
    }
}
