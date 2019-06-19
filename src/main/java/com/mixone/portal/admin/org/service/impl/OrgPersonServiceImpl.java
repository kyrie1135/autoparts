package com.mixone.portal.admin.org.service.impl;

import com.mixone.portal.admin.org.mapper.OrgPersonMapper;
import com.mixone.portal.admin.org.model.OrgPerson;
import com.mixone.portal.admin.org.model.OrgPersonExample;
import com.mixone.portal.admin.org.service.OrgPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgPersonServiceImpl implements OrgPersonService {
    @Autowired
    OrgPersonMapper orgPersonMapper;

    @Override
    public long countByExample(OrgPersonExample example) {
        return orgPersonMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrgPersonExample example) {
        return orgPersonMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String orgPersonId) {
        return orgPersonMapper.deleteByPrimaryKey(orgPersonId);
    }

    @Override
    public int insert(OrgPerson record) {
        return orgPersonMapper.insert(record);
    }

    @Override
    public int insertSelective(OrgPerson record) {
        return orgPersonMapper.insertSelective(record);
    }

    @Override
    public List<OrgPerson> selectByExample(OrgPersonExample example) {
        return orgPersonMapper.selectByExample(example);
    }

    @Override
    public OrgPerson selectByPrimaryKey(String orgPersonId) {
        return orgPersonMapper.selectByPrimaryKey(orgPersonId);
    }

    @Override
    public int updateByExampleSelective(OrgPerson record, OrgPersonExample example) {
        return orgPersonMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(OrgPerson record, OrgPersonExample example) {
        return orgPersonMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrgPerson record) {
        return orgPersonMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrgPerson record) {
        return orgPersonMapper.updateByPrimaryKey(record);
    }
}
