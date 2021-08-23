package com.yunqiic.iot.db.service;

import com.github.pagehelper.PageHelper;
import com.yunqiic.iot.db.dao.IotCategoryMapper;
import com.yunqiic.iot.db.domain.IotCategory;
import com.yunqiic.iot.db.domain.IotCategoryExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IotCategoryService {
    @Resource
    private IotCategoryMapper categoryMapper;
    private IotCategory.Column[] CHANNEL = {IotCategory.Column.id, IotCategory.Column.name, IotCategory.Column.iconUrl};

    public List<IotCategory> queryL1WithoutRecommend(int offset, int limit) {
        IotCategoryExample example = new IotCategoryExample();
        example.or().andLevelEqualTo("L1").andNameNotEqualTo("推荐").andDeletedEqualTo(false);
        PageHelper.startPage(offset, limit);
        return categoryMapper.selectByExample(example);
    }

    public List<IotCategory> queryL1(int offset, int limit) {
        IotCategoryExample example = new IotCategoryExample();
        example.or().andLevelEqualTo("L1").andDeletedEqualTo(false);
        PageHelper.startPage(offset, limit);
        return categoryMapper.selectByExample(example);
    }

    public List<IotCategory> queryL1() {
        IotCategoryExample example = new IotCategoryExample();
        example.or().andLevelEqualTo("L1").andDeletedEqualTo(false);
        return categoryMapper.selectByExample(example);
    }

    public List<IotCategory> queryByPid(Integer pid) {
        IotCategoryExample example = new IotCategoryExample();
        example.or().andPidEqualTo(pid).andDeletedEqualTo(false);
        return categoryMapper.selectByExample(example);
    }

    public List<IotCategory> queryL2ByIds(List<Integer> ids) {
        IotCategoryExample example = new IotCategoryExample();
        example.or().andIdIn(ids).andLevelEqualTo("L2").andDeletedEqualTo(false);
        return categoryMapper.selectByExample(example);
    }

    public IotCategory findById(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    public List<IotCategory> querySelective(String id, String name, Integer page, Integer size, String sort, String order) {
        IotCategoryExample example = new IotCategoryExample();
        IotCategoryExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(id)) {
            criteria.andIdEqualTo(Integer.valueOf(id));
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return categoryMapper.selectByExample(example);
    }

    public int updateById(IotCategory category) {
        category.setUpdateTime(LocalDateTime.now());
        return categoryMapper.updateByPrimaryKeySelective(category);
    }

    public void deleteById(Integer id) {
        categoryMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(IotCategory category) {
        category.setAddTime(LocalDateTime.now());
        category.setUpdateTime(LocalDateTime.now());
        categoryMapper.insertSelective(category);
    }

    public List<IotCategory> queryChannel() {
        IotCategoryExample example = new IotCategoryExample();
        example.or().andLevelEqualTo("L1").andDeletedEqualTo(false);
        return categoryMapper.selectByExampleSelective(example, CHANNEL);
    }
}
