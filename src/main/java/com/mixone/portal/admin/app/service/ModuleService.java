package com.mixone.portal.admin.app.service;

import com.mixone.portal.admin.app.model.Module;
import com.mixone.portal.admin.app.model.ModuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModuleService {
    long countByExample(ModuleExample example);

    int deleteByExample(ModuleExample example);

    int deleteByPrimaryKey(String moduleId);

    int insert(Module record);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(String moduleId);

    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByExample(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);

}
