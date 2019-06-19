package com.mixone.portal.admin.util;

public class PageUtil {


    public static Page getPage(String currentPage, long recordCount, String url) {
        //每页显示的条数
        long pageSize = Long.parseLong(Page.DEFAULT_PAGESIZE);

        //总页数
        long pageCount;
        if(recordCount % pageSize == 0){

            pageCount = recordCount/pageSize;
        }else{
            pageCount = recordCount/pageSize + 1;
        }

        //页面初始的时候pageNo没有值
        if(null == currentPage
                || "".equalsIgnoreCase(currentPage)
                || "0".equalsIgnoreCase(currentPage)){

            currentPage = "1";
        }

        //每页开始的第几条记录
        long startRow = (Long.parseLong(currentPage)-1) * pageSize;
        Page page=new Page();

        page.setStartRow(startRow);
        page.setCurrentPage(Integer.parseInt(currentPage));
        page.setPageSize(pageSize);
        page.setPageCount(pageCount);
        page.setTotalNum(recordCount);
        page.setUrl(url);
        return page;
    }

}
