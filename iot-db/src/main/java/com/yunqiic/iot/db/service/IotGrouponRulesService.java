package com.yunqiic.iot.db.service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.yunqiic.iot.db.dao.IotGoodsMapper;
import com.yunqiic.iot.db.dao.IotGrouponRulesMapper;
import com.yunqiic.iot.db.domain.IotGoods;
import com.yunqiic.iot.db.domain.IotGrouponRules;
import com.yunqiic.iot.db.domain.IotGrouponRulesExample;
import com.yunqiic.iot.db.util.GrouponConstant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IotGrouponRulesService {
    @Resource
    private IotGrouponRulesMapper mapper;
    @Resource
    private IotGoodsMapper goodsMapper;
    private IotGoods.Column[] goodsColumns = new IotGoods.Column[]{IotGoods.Column.id, IotGoods.Column.name, IotGoods.Column.brief, IotGoods.Column.picUrl, IotGoods.Column.counterPrice, IotGoods.Column.retailPrice};

    public int createRules(IotGrouponRules rules) {
        rules.setAddTime(LocalDateTime.now());
        rules.setUpdateTime(LocalDateTime.now());
        return mapper.insertSelective(rules);
    }

    /**
     * 根据ID查找对应团购项
     *
     * @param id
     * @return
     */
    public IotGrouponRules findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 查询某个商品关联的团购规则
     *
     * @param goodsId
     * @return
     */
    public List<IotGrouponRules> queryByGoodsId(Integer goodsId) {
        IotGrouponRulesExample example = new IotGrouponRulesExample();
        example.or().andGoodsIdEqualTo(goodsId).andStatusEqualTo(GrouponConstant.RULE_STATUS_ON).andDeletedEqualTo(false);
        return mapper.selectByExample(example);
    }

    public int countByGoodsId(Integer goodsId) {
        IotGrouponRulesExample example = new IotGrouponRulesExample();
        example.or().andGoodsIdEqualTo(goodsId).andStatusEqualTo(GrouponConstant.RULE_STATUS_ON).andDeletedEqualTo(false);
        return (int)mapper.countByExample(example);
    }

    public List<IotGrouponRules> queryByStatus(Short status) {
        IotGrouponRulesExample example = new IotGrouponRulesExample();
        example.or().andStatusEqualTo(status).andDeletedEqualTo(false);
        return mapper.selectByExample(example);
    }

    /**
     * 获取首页团购规则列表
     *
     * @param page
     * @param limit
     * @return
     */
    public List<IotGrouponRules> queryList(Integer page, Integer limit) {
        return queryList(page, limit, "add_time", "desc");
    }

    public List<IotGrouponRules> queryList(Integer page, Integer limit, String sort, String order) {
        IotGrouponRulesExample example = new IotGrouponRulesExample();
        example.or().andStatusEqualTo(GrouponConstant.RULE_STATUS_ON).andDeletedEqualTo(false);
        example.setOrderByClause(sort + " " + order);
        PageHelper.startPage(page, limit);
        return mapper.selectByExample(example);
    }

    /**
     * 判断某个团购规则是否已经过期
     *
     * @return
     */
    public boolean isExpired(IotGrouponRules rules) {
        return (rules == null || rules.getExpireTime().isBefore(LocalDateTime.now()));
    }

    /**
     * 获取团购规则列表
     *
     * @param goodsId
     * @param page
     * @param size
     * @param sort
     * @param order
     * @return
     */
    public List<IotGrouponRules> querySelective(String goodsId, Integer page, Integer size, String sort, String order) {
        IotGrouponRulesExample example = new IotGrouponRulesExample();
        example.setOrderByClause(sort + " " + order);

        IotGrouponRulesExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(goodsId)) {
            criteria.andGoodsIdEqualTo(Integer.parseInt(goodsId));
        }
        criteria.andDeletedEqualTo(false);

        PageHelper.startPage(page, size);
        return mapper.selectByExample(example);
    }

    public void delete(Integer id) {
        mapper.logicalDeleteByPrimaryKey(id);
    }

    public int updateById(IotGrouponRules grouponRules) {
        grouponRules.setUpdateTime(LocalDateTime.now());
        return mapper.updateByPrimaryKeySelective(grouponRules);
    }
}