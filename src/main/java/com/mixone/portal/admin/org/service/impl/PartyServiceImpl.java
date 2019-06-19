package com.mixone.portal.admin.org.service.impl;

import com.mixone.portal.admin.org.mapper.PartyMapper;
import com.mixone.portal.admin.org.model.Party;
import com.mixone.portal.admin.org.model.PartyExample;
import com.mixone.portal.admin.org.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyServiceImpl implements PartyService {
    @Autowired
    PartyMapper partyService;
    @Override
    public long countByExample(PartyExample example) {
        return partyService.countByExample(example);
    }

    @Override
    public int deleteByExample(PartyExample example) {
        return partyService.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String partyId) {
        return partyService.deleteByPrimaryKey(partyId);
    }

    @Override
    public int insert(Party record) {
        return partyService.insert(record);
    }

    @Override
    public int insertSelective(Party record) {
        return partyService.insert(record);
    }

    @Override
    public List<Party> selectByExample(PartyExample example) {
        return partyService.selectByExample(example);
    }

    @Override
    public Party selectByPrimaryKey(String partyId) {
        return partyService.selectByPrimaryKey(partyId);
    }

    @Override
    public int updateByExampleSelective(Party record, PartyExample example) {
        return partyService.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Party record, PartyExample example) {
        return partyService.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Party record) {
        return partyService.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Party record) {
        return partyService.updateByPrimaryKey(record);
    }
}
