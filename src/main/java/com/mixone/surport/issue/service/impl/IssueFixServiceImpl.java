package com.mixone.surport.issue.service.impl;

import com.mixone.surport.issue.mapper.IssueFixMapper;
import com.mixone.surport.issue.model.IssueFix;
import com.mixone.surport.issue.model.IssueFixExample;
import com.mixone.surport.issue.service.IssueFixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueFixServiceImpl implements IssueFixService {
    @Autowired
    IssueFixMapper issueFixMapper;

    @Override
    public long countByExample(IssueFixExample example) {
        return issueFixMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(IssueFixExample example) {
        return issueFixMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String issueFixId) {
        return issueFixMapper.deleteByPrimaryKey(issueFixId);
    }

    @Override
    public int insert(IssueFix record) {
        return issueFixMapper.insert(record);
    }

    @Override
    public int insertSelective(IssueFix record) {
        return issueFixMapper.insertSelective(record);
    }

    @Override
    public List<IssueFix> selectByExample(IssueFixExample example) {
        return issueFixMapper.selectByExample(example);
    }

    @Override
    public IssueFix selectByPrimaryKey(String issueFixId) {
        return issueFixMapper.selectByPrimaryKey(issueFixId);
    }

    @Override
    public int updateByExampleSelective(IssueFix record, IssueFixExample example) {
        return issueFixMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(IssueFix record, IssueFixExample example) {
        return issueFixMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(IssueFix record) {
        return issueFixMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IssueFix record) {
        return issueFixMapper.updateByPrimaryKey(record);
    }
}
