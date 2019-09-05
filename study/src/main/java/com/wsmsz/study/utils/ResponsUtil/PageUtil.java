package com.wsmsz.study.utils.ResponsUtil;

import java.io.Serializable;

/**
 * @ClassName PageUtil
 * @Description TODO
 * @Author wang
 * @Date 2019/9/5 9:51
 * @Version 1.0
 */
public class PageUtil implements Serializable {

    int pageNum;

    int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
