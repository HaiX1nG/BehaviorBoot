package com.example.bean;

public class TopTenCategory {
    private Integer categoryId;
    private Long cnt;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "Top10Category{" +
                "categoryId=" + categoryId +
                ", cnt=" + cnt +
                '}';
    }
}
