package com.example.bean;

public class RFMCustomerAnalysis {
    private String userType;
    private Long userCnt;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Long getUserCnt() {
        return userCnt;
    }

    public void setUserCnt(Long userCnt) {
        this.userCnt = userCnt;
    }

    @Override
    public String toString() {
        return "RFMCustomerAnalysis{" +
                "userType='" + userType + '\'' +
                ", userCnt=" + userCnt +
                '}';
    }
}
