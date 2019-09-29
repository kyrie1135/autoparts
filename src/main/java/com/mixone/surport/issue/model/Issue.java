package com.mixone.surport.issue.model;

import java.io.Serializable;
import java.util.Date;

/**
 * issue
 * @author 
 */
public class Issue implements Serializable {
    private String issueId;

    private String issueTitle;

    private String issueContent;

    private String reporter;

    private String reporterId;

    private String issueType;

    private String issueStatus;

    private String issuePic;

    private String issueFix;

    private String issueFeedback;

    private Date createdTime;

    private String createdUserLogin;

    private Date lastUpdatedTime;

    private String lastUpdatedUserLogin;

    private static final long serialVersionUID = 1L;

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public String getIssueContent() {
        return issueContent;
    }

    public void setIssueContent(String issueContent) {
        this.issueContent = issueContent;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getReporterId() {
        return reporterId;
    }

    public void setReporterId(String reporterId) {
        this.reporterId = reporterId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedUserLogin() {
        return createdUserLogin;
    }

    public void setCreatedUserLogin(String createdUserLogin) {
        this.createdUserLogin = createdUserLogin;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getLastUpdatedUserLogin() {
        return lastUpdatedUserLogin;
    }

    public void setLastUpdatedUserLogin(String lastUpdatedUserLogin) {
        this.lastUpdatedUserLogin = lastUpdatedUserLogin;
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
        Issue other = (Issue) that;
        return (this.getIssueId() == null ? other.getIssueId() == null : this.getIssueId().equals(other.getIssueId()))
            && (this.getIssueTitle() == null ? other.getIssueTitle() == null : this.getIssueTitle().equals(other.getIssueTitle()))
            && (this.getIssueContent() == null ? other.getIssueContent() == null : this.getIssueContent().equals(other.getIssueContent()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getReporterId() == null ? other.getReporterId() == null : this.getReporterId().equals(other.getReporterId()))
            && (this.getIssueType() == null ? other.getIssueType() == null : this.getIssueType().equals(other.getIssueType()))
            && (this.getIssueStatus() == null ? other.getIssueStatus() == null : this.getIssueStatus().equals(other.getIssueStatus()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getCreatedUserLogin() == null ? other.getCreatedUserLogin() == null : this.getCreatedUserLogin().equals(other.getCreatedUserLogin()))
            && (this.getLastUpdatedTime() == null ? other.getLastUpdatedTime() == null : this.getLastUpdatedTime().equals(other.getLastUpdatedTime()))
            && (this.getLastUpdatedUserLogin() == null ? other.getLastUpdatedUserLogin() == null : this.getLastUpdatedUserLogin().equals(other.getLastUpdatedUserLogin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIssueId() == null) ? 0 : getIssueId().hashCode());
        result = prime * result + ((getIssueTitle() == null) ? 0 : getIssueTitle().hashCode());
        result = prime * result + ((getIssueContent() == null) ? 0 : getIssueContent().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getReporterId() == null) ? 0 : getReporterId().hashCode());
        result = prime * result + ((getIssueType() == null) ? 0 : getIssueType().hashCode());
        result = prime * result + ((getIssueStatus() == null) ? 0 : getIssueStatus().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getCreatedUserLogin() == null) ? 0 : getCreatedUserLogin().hashCode());
        result = prime * result + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        result = prime * result + ((getLastUpdatedUserLogin() == null) ? 0 : getLastUpdatedUserLogin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", issueId=").append(issueId);
        sb.append(", issueTitle=").append(issueTitle);
        sb.append(", issueContent=").append(issueContent);
        sb.append(", reporter=").append(reporter);
        sb.append(", reporterId=").append(reporterId);
        sb.append(", issueType=").append(issueType);
        sb.append(", issueStatus=").append(issueStatus);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdUserLogin=").append(createdUserLogin);
        sb.append(", lastUpdatedTime=").append(lastUpdatedTime);
        sb.append(", lastUpdatedUserLogin=").append(lastUpdatedUserLogin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


    public String getIssuePic() {
        return issuePic;
    }

    public void setIssuePic(String issuePic) {
        this.issuePic = issuePic;
    }

    public String getIssueFix() {
        return issueFix;
    }

    public void setIssueFix(String issueFix) {
        this.issueFix = issueFix;
    }

    public String getIssueFeedback() {
        return issueFeedback;
    }

    public void setIssueFeedback(String issueFeedback) {
        this.issueFeedback = issueFeedback;
    }
}