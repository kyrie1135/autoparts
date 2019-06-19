package com.mixone.portal.admin.app.service.impl;

import com.mixone.portal.admin.app.mapper.ModuleResMapper;
import com.mixone.portal.admin.app.model.ModuleRes;
import com.mixone.portal.admin.app.model.ModuleResExample;
import com.mixone.portal.admin.app.service.ModuleResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleResServiceImpl implements ModuleResService {
    @Autowired
    ModuleResMapper moduleResMapper;

    @Override
    public long countByExample(ModuleResExample example) {
        return moduleResMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ModuleResExample example) {
        return moduleResMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String moduleResId) {
        return moduleResMapper.deleteByPrimaryKey(moduleResId);
    }

    @Override
    public int insert(ModuleRes record) {
        return moduleResMapper.insert(record);
    }

    @Override
    public int insertSelective(ModuleRes record) {
        return moduleResMapper.insertSelective(record);
    }

    @Override
    public List<ModuleRes> selectByExample(ModuleResExample example) {
        return moduleResMapper.selectByExample(example);
    }

    @Override
    public ModuleRes selectByPrimaryKey(String moduleResId) {
        return moduleResMapper.selectByPrimaryKey(moduleResId);
    }

    @Override
    public int updateByExampleSelective(ModuleRes record, ModuleResExample example) {
        return moduleResMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ModuleRes record, ModuleResExample example) {
        return moduleResMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ModuleRes record) {
        return moduleResMapper.updateByPrimaryKeySelective(record);

    }

    @Override
    public int updateByPrimaryKey(ModuleRes record) {
        return moduleResMapper.updateByPrimaryKey(record);
    }
}
