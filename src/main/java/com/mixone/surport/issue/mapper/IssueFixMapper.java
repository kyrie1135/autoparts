package com.mixone.surport.issue.mapper;

import com.mixone.surport.issue.model.IssueFix;
import com.mixone.surport.issue.model.IssueFixExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IssueFixMapper {
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