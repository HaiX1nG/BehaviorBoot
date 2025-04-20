package com.example.bean;

public class TopTenItem {
    private Integer itemId;
    private Long cnt;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "TopTenItem{" +
                "itemId=" + itemId +
                ", cnt=" + cnt +
                '}';
    }
}
