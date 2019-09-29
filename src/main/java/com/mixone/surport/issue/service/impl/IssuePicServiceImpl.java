package com.mixone.surport.issue.service.impl;

import com.mixone.surport.issue.mapper.IssuePicMapper;
import com.mixone.surport.issue.model.IssuePic;
import com.mixone.surport.issue.model.IssuePicExample;
import com.mixone.surport.issue.service.IssuePicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuePicServiceImpl implements IssuePicService {

    @Autowired
    IssuePicMapper issuePicMapper;

    @Override
    public long countByExample(IssuePicExample example) {
        return issuePicMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(IssuePicExample example) {
        return issuePicMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String issuePicId) {
        return issuePicMapper.deleteByPrimaryKey(issuePicId);
    }

    @Override
    public int insert(IssuePic record) {
        return issuePicMapper.insert(record);
    }

    @Override
    public int insertSelective(IssuePic record) {
        return issuePicMapper.insertSelective(record);
    }

    @Override
    public List<IssuePic> selectByExampleWithBLOBs(IssuePicExample example) {
        return issuePicMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<IssuePic> selectByExample(IssuePicExample example) {
        return issuePicMapper.selectByExample(example);
    }

    @Override
    public IssuePic selectByPrimaryKey(String issuePicId) {
        return issuePicMapper.selectByPrimaryKey(issuePicId);
    }

    @Override
    public int updateByExampleSelective(IssuePic record, IssuePicExample example) {
        return issuePicMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(IssuePic record, IssuePicExample example) {
        return issuePicMapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(IssuePic record, IssuePicExample example) {
        return issuePicMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(IssuePic record) {
        return issuePicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(IssuePic record) {
        return issuePicMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(IssuePic record) {
        return issuePicMapper.updateByPrimaryKey(record);
    }
}
