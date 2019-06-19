package com.mixone.portal.admin.org.mapper;

import com.mixone.portal.admin.org.model.Party;
import com.mixone.portal.admin.org.model.PartyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PartyMapper {
    long countByExample(PartyExample example);

    int deleteByExample(PartyExample example);

    int deleteByPrimaryKey(String partyId);

    int insert(Party record);

    int insertSelective(Party record);

    List<Party> selectByExample(PartyExample example);

    Party selectByPrimaryKey(String partyId);

    int updateByExampleSelective(@Param("record") Party record, @Param("example") PartyExample example);

    int updateByExample(@Param("record") Party record, @Param("example") PartyExample example);

    int updateByPrimaryKeySelective(Party record);

    int updateByPrimaryKey(Party record);
}