package com.mixone.portal.admin.app.service.impl;

import com.mixone.portal.admin.app.mapper.ApplicationMapper;
import com.mixone.portal.admin.app.model.Application;
import com.mixone.portal.admin.app.model.ApplicationExample;
import com.mixone.portal.admin.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private ApplicationMapper applicationMapper;


    @Override
    public long countByExample(ApplicationExample example) {
        return applicationMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ApplicationExample example) {
        return applicationMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String appId) {
        return applicationMapper.deleteByPrimaryKey(appId);
    }

    @Override
    public int insert(Application record) {
        return applicationMapper.insert(record);
    }

    @Override
    public int insertSelective(Application record) {
        return applicationMapper.insertSelective(record);
    }

    @Override
    public List<Application> selectByExample(ApplicationExample example) {
        return applicationMapper.selectByExample(example);
    }

    @Override
    public Application selectByPrimaryKey(String appId) {
        return applicationMapper.selectByPrimaryKey(appId);
    }

    @Override
    public int updateByExampleSelective(Application record, ApplicationExample example) {
        return applicationMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Application record, ApplicationExample example) {
        return applicationMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Application record) {
        return applicationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Application record) {
        return applicationMapper.updateByPrimaryKey(record);
    }
}
