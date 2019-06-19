package com.mixone.portal.admin.org.service;

import com.mixone.portal.admin.org.model.OrgPerson;
import com.mixone.portal.admin.org.model.OrgPersonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrgPersonService {
    long countByExample(OrgPersonExample example);

    int deleteByExample(OrgPersonExample example);

    int deleteByPrimaryKey(String orgPersonId);

    int insert(OrgPerson record);

    int insertSelective(OrgPerson record);

    List<OrgPerson> selectByExample(OrgPersonExample example);

    OrgPerson selectByPrimaryKey(String orgPersonId);

    int updateByExampleSelective(@Param("record") OrgPerson record, @Param("example") OrgPersonExample example);

    int updateByExample(@Param("record") OrgPerson record, @Param("example") OrgPersonExample example);

    int updateByPrimaryKeySelective(OrgPerson record);

    int updateByPrimaryKey(OrgPerson record);
}
