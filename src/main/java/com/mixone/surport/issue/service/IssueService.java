package com.mixone.surport.issue.service;

import com.mixone.surport.issue.model.Issue;
import com.mixone.surport.issue.model.IssueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IssueService {
    long countByExample(IssueExample example);

    int deleteByExample(IssueExample example);

    int deleteByPrimaryKey(String issueId);

    int insert(Issue record);

    int insertSelective(Issue record);

    List<Issue> selectByExample(IssueExample example);

    Issue selectByPrimaryKey(String issueId);

    int updateByExampleSelective(@Param("record") Issue record, @Param("example") IssueExample example);

    int updateByExample(@Param("record") Issue record, @Param("example") IssueExample example);

    int updateByPrimaryKeySelective(Issue record);

    int updateByPrimaryKey(Issue record);
}
