package com.yunqiic.iot.db.service;

import com.github.pagehelper.PageHelper;
import com.yunqiic.iot.db.dao.IotRegionMapper;
import com.yunqiic.iot.db.domain.IotRegion;
import com.yunqiic.iot.db.domain.IotRegionExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IotRegionService {

    @Resource
    private IotRegionMapper regionMapper;

    public List<IotRegion> getAll(){
        IotRegionExample example = new IotRegionExample();
        byte b = 4;
        example.or().andTypeNotEqualTo(b);
        return regionMapper.selectByExample(example);
    }

    public List<IotRegion> queryByPid(Integer parentId) {
        IotRegionExample example = new IotRegionExample();
        example.or().andPidEqualTo(parentId);
        return regionMapper.selectByExample(example);
    }

    public IotRegion findById(Integer id) {
        return regionMapper.selectByPrimaryKey(id);
    }

    public List<IotRegion> querySelective(String name, Integer code, Integer page, Integer size, String sort, String order) {
        IotRegionExample example = new IotRegionExample();
        IotRegionExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (!StringUtils.isEmpty(code)) {
            criteria.andCodeEqualTo(code);
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return regionMapper.selectByExample(example);
    }

}
