package com.mixone.portal.admin.right.service.impl;

import com.mixone.portal.admin.right.mapper.RolePartyMapper;
import com.mixone.portal.admin.right.model.RoleParty;
import com.mixone.portal.admin.right.model.RolePartyExample;
import com.mixone.portal.admin.right.service.RolePartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePartyServiceImpl implements RolePartyService {

    @Autowired
    private RolePartyMapper rolePartyMapper;

    @Override
    public long countByExample(RolePartyExample example) {
        return rolePartyMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RolePartyExample example) {
        return rolePartyMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String rolePartyId) {
        return rolePartyMapper.deleteByPrimaryKey(rolePartyId);
    }

    @Override
    public int insert(RoleParty record) {
        return rolePartyMapper.insert(record);
    }

    @Override
    public int insertSelective(RoleParty record) {
        return rolePartyMapper.insertSelective(record);
    }

    @Override
    public List<RoleParty> selectByExample(RolePartyExample example) {
        return rolePartyMapper.selectByExample(example);
    }

    @Override
    public RoleParty selectByPrimaryKey(String rolePartyId) {
        return rolePartyMapper.selectByPrimaryKey(rolePartyId);
    }

    @Override
    public int updateByExampleSelective(RoleParty record, RolePartyExample example) {
        return rolePartyMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(RoleParty record, RolePartyExample example) {
        return rolePartyMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleParty record) {
        return rolePartyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleParty record) {
        return rolePartyMapper.updateByPrimaryKey(record);
    }
}
