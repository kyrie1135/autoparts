package com.mixone.portal.admin.org.mapper;

import com.mixone.portal.admin.org.model.OrgNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrgNodeMapper {
    public List<OrgNode> findOrgNode(String parentId);

}
