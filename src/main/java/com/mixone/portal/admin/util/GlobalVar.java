package com.mixone.portal.admin.util;

public class GlobalVar {

    public static String TOP_ORG_NAME = "巨兴科技有限公司";
    public static String TOP_ORG_CODE = "000000";
    public static String TOP_ORG_PARTY_ID = "0";


    private String topOrgName;
    private String topOrgCode;
    private String topOrgID;

    public void setTopOrgName(String topOrgName) {
        if (!"".equals(topOrgName)) {
            this.topOrgName = topOrgName;
            this.TOP_ORG_NAME = topOrgName;
        }else{
            this.topOrgName = TOP_ORG_NAME;
        }
    }

    public void setTopOrgCode(String topOrgCode) {
        if (!"".equals(topOrgCode)) {
            this.topOrgCode = topOrgCode;
            this.TOP_ORG_CODE = topOrgCode;
        }else{
            this.topOrgCode = TOP_ORG_CODE;
        }
    }


    public void setTopOrgID(String topOrgID) {
        if (!"".equals(topOrgID)) {
            this.topOrgID = topOrgID;
            TOP_ORG_PARTY_ID = topOrgID;
        }else{
            this.topOrgID = TOP_ORG_PARTY_ID;
        }
    }

    public String getTopOrgName() {
        return topOrgName;
    }

    public String getTopOrgCode() {
        return topOrgCode;
    }

    public String getTopOrgID() {
        return topOrgID;
    }
}
