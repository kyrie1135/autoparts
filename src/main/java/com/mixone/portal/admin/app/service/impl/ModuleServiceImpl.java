package com.mixone.portal.admin.app.service.impl;

import com.mixone.portal.admin.app.mapper.ModuleMapper;
import com.mixone.portal.admin.app.model.Module;
import com.mixone.portal.admin.app.model.ModuleExample;
import com.mixone.portal.admin.app.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    ModuleMapper moduleMapper;

    @Override
    public long countByExample(ModuleExample example) {
        return moduleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ModuleExample example) {
        return moduleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String moduleId) {
        return moduleMapper.deleteByPrimaryKey(moduleId);
    }

    @Override
    public int insert(Module record) {
        return moduleMapper.insert(record);
    }

    @Override
    public int insertSelective(Module record) {
        return moduleMapper.insertSelective(record);
    }

    @Override
    public List<Module> selectByExample(ModuleExample example) {
        return moduleMapper.selectByExample(example);
    }

    @Override
    public Module selectByPrimaryKey(String moduleId) {
        return moduleMapper.selectByPrimaryKey(moduleId);
    }

    @Override
    public int updateByExampleSelective(Module record, ModuleExample example) {
        return moduleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Module record, ModuleExample example) {
        return moduleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Module record) {
        return moduleMapper.updateByPrimaryKeySelective(record);

    }

    @Override
    public int updateByPrimaryKey(Module record) {
        return moduleMapper.updateByPrimaryKey(record);
    }
}
