package com.mixone.autoparts.autopart.mapper;

import com.mixone.autoparts.autopart.model.AutoPart;
import com.mixone.autoparts.autopart.model.AutoPartExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AutoPartMapper {
    long countByExample(AutoPartExample example);

    int deleteByExample(AutoPartExample example);

    int deleteByPrimaryKey(String autopartId);

    int insert(AutoPart record);

    int insertSelective(AutoPart record);

    List<AutoPart> selectByExample(AutoPartExample example);

    AutoPart selectByPrimaryKey(String autopartId);

    int updateByExampleSelective(@Param("record") AutoPart record, @Param("example") AutoPartExample example);

    int updateByExample(@Param("record") AutoPart record, @Param("example") AutoPartExample example);

    int updateByPrimaryKeySelective(AutoPart record);

    int updateByPrimaryKey(AutoPart record);
}