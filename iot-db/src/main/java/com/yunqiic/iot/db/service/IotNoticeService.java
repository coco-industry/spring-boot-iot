package com.yunqiic.iot.db.service;

import com.github.pagehelper.PageHelper;
import com.yunqiic.iot.db.dao.IotNoticeMapper;
import com.yunqiic.iot.db.domain.IotNotice;
import com.yunqiic.iot.db.domain.IotNoticeExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IotNoticeService {
    @Resource
    private IotNoticeMapper noticeMapper;


    public List<IotNotice> querySelective(String title, String content, Integer page, Integer limit, String sort, String order) {
        IotNoticeExample example = new IotNoticeExample();
        IotNoticeExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(title)) {
            criteria.andTitleLike("%" + title + "%");
        }
        if (!StringUtils.isEmpty(content)) {
            criteria.andContentLike("%" + content + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return noticeMapper.selectByExample(example);
    }

    public int updateById(IotNotice notice) {
        notice.setUpdateTime(LocalDateTime.now());
        return noticeMapper.updateByPrimaryKeySelective(notice);
    }

    public void deleteById(Integer id) {
        noticeMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(IotNotice notice) {
        notice.setAddTime(LocalDateTime.now());
        notice.setUpdateTime(LocalDateTime.now());
        noticeMapper.insertSelective(notice);
    }

    public IotNotice findById(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }

    public void deleteByIds(List<Integer> ids) {
        IotNoticeExample example = new IotNoticeExample();
        example.or().andIdIn(ids).andDeletedEqualTo(false);
        IotNotice notice = new IotNotice();
        notice.setUpdateTime(LocalDateTime.now());
        notice.setDeleted(true);
        noticeMapper.updateByExampleSelective(notice, example);
    }
}
