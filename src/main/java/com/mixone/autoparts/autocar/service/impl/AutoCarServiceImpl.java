package com.mixone.autoparts.autocar.service.impl;

import com.mixone.autoparts.autocar.mapper.AutoCarMapper;
import com.mixone.autoparts.autocar.model.AutoCar;
import com.mixone.autoparts.autocar.model.AutoCarExample;
import com.mixone.autoparts.autocar.service.AutoCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoCarServiceImpl implements AutoCarService {

    @Autowired
    AutoCarMapper autoCarMapper;

    @Override
    public long countByExample(AutoCarExample example) {
        return autoCarMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AutoCarExample example) {
        return autoCarMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String autocarId) {
        return autoCarMapper.deleteByPrimaryKey(autocarId);
    }

    @Override
    public int insert(AutoCar record) {
        return autoCarMapper.insert(record);
    }

    @Override
    public int insertSelective(AutoCar record) {
        return autoCarMapper.insertSelective(record);
    }

    @Override
    public List<AutoCar> selectByExample(AutoCarExample example) {
        return autoCarMapper.selectByExample(example);
    }

    @Override
    public AutoCar selectByPrimaryKey(String autocarId) {
        return autoCarMapper.selectByPrimaryKey(autocarId);
    }

    @Override
    public int updateByExampleSelective(AutoCar record, AutoCarExample example) {
        return autoCarMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(AutoCar record, AutoCarExample example) {
        return autoCarMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(AutoCar record) {
        return autoCarMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AutoCar record) {
        return autoCarMapper.updateByPrimaryKey(record);
    }
}
