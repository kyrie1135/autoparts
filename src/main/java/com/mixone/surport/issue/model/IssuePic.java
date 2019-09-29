package com.mixone.surport.issue.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * issue_pic
 * @author 
 */
public class IssuePic implements Serializable {
    private String issuePicId;

    private String issueId;

    private String issuePicUrl;

    private byte[] issuePic;

    private static final long serialVersionUID = 1L;

    public String getIssuePicId() {
        return issuePicId;
    }

    public void setIssuePicId(String issuePicId) {
        this.issuePicId = issuePicId;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssuePicUrl() {
        return issuePicUrl;
    }

    public void setIssuePicUrl(String issuePicUrl) {
        this.issuePicUrl = issuePicUrl;
    }

    public byte[] getIssuePic() {
        return issuePic;
    }

    public void setIssuePic(byte[] issuePic) {
        this.issuePic = issuePic;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        IssuePic other = (IssuePic) that;
        return (this.getIssuePicId() == null ? other.getIssuePicId() == null : this.getIssuePicId().equals(other.getIssuePicId()))
            && (this.getIssueId() == null ? other.getIssueId() == null : this.getIssueId().equals(other.getIssueId()))
            && (this.getIssuePicUrl() == null ? other.getIssuePicUrl() == null : this.getIssuePicUrl().equals(other.getIssuePicUrl()))
            && (Arrays.equals(this.getIssuePic(), other.getIssuePic()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIssuePicId() == null) ? 0 : getIssuePicId().hashCode());
        result = prime * result + ((getIssueId() == null) ? 0 : getIssueId().hashCode());
        result = prime * result + ((getIssuePicUrl() == null) ? 0 : getIssuePicUrl().hashCode());
        result = prime * result + (Arrays.hashCode(getIssuePic()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", issuePicId=").append(issuePicId);
        sb.append(", issueId=").append(issueId);
        sb.append(", issuePicUrl=").append(issuePicUrl);
        sb.append(", issuePic=").append(issuePic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}