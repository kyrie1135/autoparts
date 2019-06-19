package com.mixone.portal.admin.right.model;

import java.util.List;

public class PartyRight {

    private String partyId;
    private List<RoleParty> roleParties;

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public List<RoleParty> getRoleParties() {
        return roleParties;
    }

    public void setRoleParties(List<RoleParty> roleParties) {
        this.roleParties = roleParties;
    }




}
