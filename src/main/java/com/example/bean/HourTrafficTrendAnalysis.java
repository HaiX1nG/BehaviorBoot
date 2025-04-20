package com.example.bean;

public class HourTrafficTrendAnalysis {
    private String hour;
    private Long userCnt;
    private Long pvCnt;
    private Long favCnt;
    private Long cartCnt;
    private Long buyCnt;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Long getUserCnt() {
        return userCnt;
    }

    public void setUserCnt(Long userCnt) {
        this.userCnt = userCnt;
    }

    public Long getPvCnt() {
        return pvCnt;
    }

    public void setPvCnt(Long pvCnt) {
        this.pvCnt = pvCnt;
    }

    public Long getFavCnt() {
        return favCnt;
    }

    public void setFavCnt(Long favCnt) {
        this.favCnt = favCnt;
    }

    public Long getCartCnt() {
        return cartCnt;
    }

    public void setCartCnt(Long cartCnt) {
        this.cartCnt = cartCnt;
    }

    public Long getBuyCnt() {
        return buyCnt;
    }

    public void setBuyCnt(Long buyCnt) {
        this.buyCnt = buyCnt;
    }

    @Override
    public String toString() {
        return "HourTrafficTrendAnalysis{" +
                "hour='" + hour + '\'' +
                ", userCnt=" + userCnt +
                ", pvCnt=" + pvCnt +
                ", favCnt=" + favCnt +
                ", cartCnt=" + cartCnt +
                ", buyCnt=" + buyCnt +
                '}';
    }
}
