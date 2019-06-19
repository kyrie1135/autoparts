package com.mixone.portal.admin.right.service.impl;

import com.mixone.portal.admin.right.mapper.RoleRightMapper;
import com.mixone.portal.admin.right.model.RoleRight;
import com.mixone.portal.admin.right.model.RoleRightExample;
import com.mixone.portal.admin.right.service.RoleRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleRightServiceImpl implements RoleRightService {
    @Autowired
    private RoleRightMapper mapper;

    @Override
    public long countByExample(RoleRightExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RoleRightExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String roleRightId) {
        return mapper.deleteByPrimaryKey(roleRightId);
    }

    @Override
    public int insert(RoleRight record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(RoleRight record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<RoleRight> selectByExample(RoleRightExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public RoleRight selectByPrimaryKey(String roleRightId) {
        return mapper.selectByPrimaryKey(roleRightId);
    }

    @Override
    public int updateByExampleSelective(RoleRight record, RoleRightExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(RoleRight record, RoleRightExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleRight record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleRight record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<RoleRight> selectResIdByRoleIds(RoleRightExample example) {
        return mapper.selectResIdByRoleIds(example);
    }
}
