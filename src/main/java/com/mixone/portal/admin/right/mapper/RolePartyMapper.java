package com.mixone.portal.admin.right.mapper;

import com.mixone.portal.admin.right.model.RoleParty;
import com.mixone.portal.admin.right.model.RolePartyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RolePartyMapper {
    long countByExample(RolePartyExample example);

    int deleteByExample(RolePartyExample example);

    int deleteByPrimaryKey(String rolePartyId);

    int insert(RoleParty record);

    int insertSelective(RoleParty record);

    List<RoleParty> selectByExample(RolePartyExample example);

    RoleParty selectByPrimaryKey(String rolePartyId);

    int updateByExampleSelective(@Param("record") RoleParty record, @Param("example") RolePartyExample example);

    int updateByExample(@Param("record") RoleParty record, @Param("example") RolePartyExample example);

    int updateByPrimaryKeySelective(RoleParty record);

    int updateByPrimaryKey(RoleParty record);
}