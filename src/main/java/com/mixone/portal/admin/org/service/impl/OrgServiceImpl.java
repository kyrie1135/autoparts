package com.mixone.portal.admin.org.service.impl;

import com.mixone.portal.admin.org.mapper.OrgMapper;
import com.mixone.portal.admin.org.mapper.OrgNodeMapper;
import com.mixone.portal.admin.org.model.Org;
import com.mixone.portal.admin.org.model.OrgExample;
import com.mixone.portal.admin.org.model.OrgNode;
import com.mixone.portal.admin.org.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {
    @Autowired
    OrgMapper orgMapper;
    @Autowired
    OrgNodeMapper orgNodeMapper;

    @Override
    public long countByExample(OrgExample example) {
        return orgMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrgExample example) {
        return orgMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String orgId) {
        return orgMapper.deleteByPrimaryKey(orgId);
    }

    @Override
    public int insert(Org record) {
        return orgMapper.insert(record);
    }

    @Override
    public int insertSelective(Org record) {
        return orgMapper.insertSelective(record);
    }

    @Override
    public List<Org> selectByExample(OrgExample example) {
        return orgMapper.selectByExample(example);
    }

    @Override
    public Org selectByPrimaryKey(String orgId) {
        return orgMapper.selectByPrimaryKey(orgId);
    }

    @Override
    public int updateByExampleSelective(Org record, OrgExample example) {
        return orgMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Org record, OrgExample example) {
        return orgMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Org record) {
        return orgMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Org record) {
        return orgMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<OrgNode> findOrgNode(String parentOrgId) {
        return orgNodeMapper.findOrgNode(parentOrgId);
    }
}
