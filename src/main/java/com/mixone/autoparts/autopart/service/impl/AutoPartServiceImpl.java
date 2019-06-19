package com.mixone.autoparts.autopart.service.impl;

import com.mixone.autoparts.autopart.mapper.AutoPartMapper;
import com.mixone.autoparts.autopart.model.AutoPart;
import com.mixone.autoparts.autopart.model.AutoPartExample;
import com.mixone.autoparts.autopart.service.AutoPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoPartServiceImpl implements AutoPartService {
    @Autowired
    AutoPartMapper autoPartMapper;

    @Override
    public long countByExample(AutoPartExample example) {
        return autoPartMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AutoPartExample example) {
        return autoPartMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String autopartsId) {
        return autoPartMapper.deleteByPrimaryKey(autopartsId);
    }

    @Override
    public int insert(AutoPart record) {
        return autoPartMapper.insert(record);
    }

    @Override
    public int insertSelective(AutoPart record) {
        return autoPartMapper.insertSelective(record);
    }

    @Override
    public List<AutoPart> selectByExample(AutoPartExample example) {
        return autoPartMapper.selectByExample(example);
    }

    @Override
    public AutoPart selectByPrimaryKey(String autopartsId) {
        return autoPartMapper.selectByPrimaryKey(autopartsId);
    }

    @Override
    public int updateByExampleSelective(AutoPart record, AutoPartExample example) {
        return autoPartMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(AutoPart record, AutoPartExample example) {
        return autoPartMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(AutoPart record) {
        return autoPartMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AutoPart record) {
        return autoPartMapper.updateByPrimaryKey(record);
    }
}
