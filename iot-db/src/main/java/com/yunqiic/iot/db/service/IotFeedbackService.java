package com.yunqiic.iot.db.service;

import com.github.pagehelper.PageHelper;
import com.yunqiic.iot.db.dao.IotFeedbackMapper;
import com.yunqiic.iot.db.domain.IotFeedback;
import com.yunqiic.iot.db.domain.IotFeedbackExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Peter
 * @date 2018/8/27 11:39
 */
@Service
public class IotFeedbackService {
    @Autowired
    private IotFeedbackMapper feedbackMapper;

    public Integer add(IotFeedback feedback) {
        feedback.setAddTime(LocalDateTime.now());
        feedback.setUpdateTime(LocalDateTime.now());
        return feedbackMapper.insertSelective(feedback);
    }

    public List<IotFeedback> querySelective(Integer userId, String username, Integer page, Integer limit, String sort, String order) {
        IotFeedbackExample example = new IotFeedbackExample();
        IotFeedbackExample.Criteria criteria = example.createCriteria();

        if (userId != null) {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return feedbackMapper.selectByExample(example);
    }
}
