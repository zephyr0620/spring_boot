package com.zephyr.common.query;

public class BaseQuery {

    private Long id;

    private int currentPage = 1; // 当前页码。(1-based)

    private int pageSize = 10; // 每页项数。

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 取得当前页显示的项的起始序号 (0-based)。
     *
     * @return 起始序号
     */
    public int getStartRow() {
        if (currentPage > 0) {
            return getPageSize() * (currentPage - 1);
        } else {
            return 0;
        }
    }
}
