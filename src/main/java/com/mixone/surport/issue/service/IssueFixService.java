package com.mixone.surport.issue.service;

import com.mixone.surport.issue.model.IssueFix;
import com.mixone.surport.issue.model.IssueFixExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IssueFixService {
    long countByExample(IssueFixExample example);

    int deleteByExample(IssueFixExample example);

    int deleteByPrimaryKey(String issueFixId);

    int insert(IssueFix record);

    int insertSelective(IssueFix record);

    List<IssueFix> selectByExample(IssueFixExample example);

    IssueFix selectByPrimaryKey(String issueFixId);

    int updateByExampleSelective(@Param("record") IssueFix record, @Param("example") IssueFixExample example);

    int updateByExample(@Param("record") IssueFix record, @Param("example") IssueFixExample example);

    int updateByPrimaryKeySelective(IssueFix record);

    int updateByPrimaryKey(IssueFix record);
}
