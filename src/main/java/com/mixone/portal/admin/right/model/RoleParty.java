package com.mixone.portal.admin.right.model;

import java.io.Serializable;

/**
 * MO_ROLE_PARTY
 * @author 
 */
public class RoleParty implements Serializable {
    private String rolePartyId;

    private String roleId;

    private String roleName;

    private String partyId;

    private static final long serialVersionUID = 1L;

    public String getRolePartyId() {
        return rolePartyId;
    }

    public void setRolePartyId(String rolePartyId) {
        this.rolePartyId = rolePartyId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
}