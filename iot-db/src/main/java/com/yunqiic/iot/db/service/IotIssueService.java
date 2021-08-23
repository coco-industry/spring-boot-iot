package com.yunqiic.iot.db.service;

import com.github.pagehelper.PageHelper;
import com.yunqiic.iot.db.dao.IotIssueMapper;
import com.yunqiic.iot.db.domain.IotIssue;
import com.yunqiic.iot.db.domain.IotIssueExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IotIssueService {
    @Resource
    private IotIssueMapper issueMapper;

    public void deleteById(Integer id) {
        issueMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(IotIssue issue) {
        issue.setAddTime(LocalDateTime.now());
        issue.setUpdateTime(LocalDateTime.now());
        issueMapper.insertSelective(issue);
    }

    public List<IotIssue> querySelective(String question, Integer page, Integer limit, String sort, String order) {
        IotIssueExample example = new IotIssueExample();
        IotIssueExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(question)) {
            criteria.andQuestionLike("%" + question + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return issueMapper.selectByExample(example);
    }

    public int updateById(IotIssue issue) {
        issue.setUpdateTime(LocalDateTime.now());
        return issueMapper.updateByPrimaryKeySelective(issue);
    }

    public IotIssue findById(Integer id) {
        return issueMapper.selectByPrimaryKey(id);
    }
}
