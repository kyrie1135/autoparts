package com.mixone.portal.admin.org.service;

import com.mixone.portal.admin.org.model.Org;
import com.mixone.portal.admin.org.model.OrgExample;
import com.mixone.portal.admin.org.model.OrgNode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrgService {
    long countByExample(OrgExample example);

    int deleteByExample(OrgExample example);

    int deleteByPrimaryKey(String orgId);

    int insert(Org record);

    int insertSelective(Org record);

    List<Org> selectByExample(OrgExample example);

    Org selectByPrimaryKey(String orgId);

    int updateByExampleSelective(@Param("record") Org record, @Param("example") OrgExample example);

    int updateByExample(@Param("record") Org record, @Param("example") OrgExample example);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);

    List<OrgNode> findOrgNode(String parentOrgId);
}
