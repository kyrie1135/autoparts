package com.mixone.portal.admin.app.service;

import com.mixone.portal.admin.app.model.ModuleRes;
import com.mixone.portal.admin.app.model.ModuleResExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModuleResService {
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
