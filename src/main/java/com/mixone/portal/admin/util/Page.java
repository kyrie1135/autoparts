package com.mixone.portal.admin.util;

public class Page {

    public static String DEFAULT_PAGESIZE = "10";
    private long currentPage;     //当前页码
    private long startRow;        //数据库开始查询的行
    private long pageSize;        //每页行数
    private long totalNum;        //总记录数
    private long pageCount;       //总页数

    private String parentId;    //查询组织专用

    private String url;          //跳转地址
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }
    public long getStartRow() {
        return startRow;
    }

    public void setStartRow(long startRow) {
        this.startRow = startRow;
    }
    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }
//private Map<String, String> params;  //查询条件
    //private Map<String, List<String>> paramLists;  //数组查询条件
    //private String searchUrl;      //Url地址
    //private String pageNoDisp;       //可以显示的页号(分隔符"|"，总页数变更时更新)
}
