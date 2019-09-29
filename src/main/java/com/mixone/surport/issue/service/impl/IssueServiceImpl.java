package com.mixone.surport.issue.service.impl;

import com.mixone.surport.issue.mapper.IssueFixMapper;
import com.mixone.surport.issue.mapper.IssueMapper;
import com.mixone.surport.issue.model.Issue;
import com.mixone.surport.issue.model.IssueExample;
import com.mixone.surport.issue.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {
    @Autowired
    IssueMapper issueMapper;

    @Override
    public long countByExample(IssueExample example) {
        return issueMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(IssueExample example) {
        return issueMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String issueId) {
        return issueMapper.deleteByPrimaryKey(issueId);
    }

    @Override
    public int insert(Issue record) {
        return issueMapper.insert(record);
    }

    @Override
    public int insertSelective(Issue record) {
        return issueMapper.insertSelective(record);
    }

    @Override
    public List<Issue> selectByExample(IssueExample example) {
        return issueMapper.selectByExample(example);
    }

    @Override
    public Issue selectByPrimaryKey(String issueId) {
        return issueMapper.selectByPrimaryKey(issueId);
    }

    @Override
    public int updateByExampleSelective(Issue record, IssueExample example) {
        return issueMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Issue record, IssueExample example) {
        return issueMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Issue record) {
        return issueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Issue record) {
        return issueMapper.updateByPrimaryKey(record);
    }
}
