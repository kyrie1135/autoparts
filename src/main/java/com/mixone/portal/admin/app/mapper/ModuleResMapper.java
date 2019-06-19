package com.mixone.portal.admin.app.mapper;

import com.mixone.portal.admin.app.model.ModuleRes;
import com.mixone.portal.admin.app.model.ModuleResExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ModuleResMapper {
    long countByExample(ModuleResExample example);

    int deleteByExample(ModuleResExample example);

    int deleteByPrimaryKey(String resourceId);

    int insert(ModuleRes record);

    int insertSelective(ModuleRes record);

    List<ModuleRes> selectByExample(ModuleResExample example);

    ModuleRes selectByPrimaryKey(String resourceId);

    int updateByExampleSelective(@Param("record") ModuleRes record, @Param("example") ModuleResExample example);

    int updateByExample(@Param("record") ModuleRes record, @Param("example") ModuleResExample example);

    int updateByPrimaryKeySelective(ModuleRes record);

    int updateByPrimaryKey(ModuleRes record);
}