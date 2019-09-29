package com.mixone.surport.issue.service;

import com.mixone.surport.issue.model.IssuePic;
import com.mixone.surport.issue.model.IssuePicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IssuePicService {
    long countByExample(IssuePicExample example);

    int deleteByExample(IssuePicExample example);

    int deleteByPrimaryKey(String issuePicId);

    int insert(IssuePic record);

    int insertSelective(IssuePic record);

    List<IssuePic> selectByExampleWithBLOBs(IssuePicExample example);

    List<IssuePic> selectByExample(IssuePicExample example);

    IssuePic selectByPrimaryKey(String issuePicId);

    int updateByExampleSelective(@Param("record") IssuePic record, @Param("example") IssuePicExample example);

    int updateByExampleWithBLOBs(@Param("record") IssuePic record, @Param("example") IssuePicExample example);

    int updateByExample(@Param("record") IssuePic record, @Param("example") IssuePicExample example);

    int updateByPrimaryKeySelective(IssuePic record);

    int updateByPrimaryKeyWithBLOBs(IssuePic record);

    int updateByPrimaryKey(IssuePic record);
}
