package com.example.bean;

public class UserRetentionAnalysis {
    private String day;
    private double reten1Rate;
    private double reten3Rate;
    private double reten5Rate;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getReten1Rate() {
        return reten1Rate;
    }

    public void setReten1Rate(double reten1Rate) {
        this.reten1Rate = reten1Rate;
    }

    public double getReten3Rate() {
        return reten3Rate;
    }

    public void setReten3Rate(double reten3Rate) {
        this.reten3Rate = reten3Rate;
    }

    public double getReten5Rate() {
        return reten5Rate;
    }

    public void setReten5Rate(double reten5Rate) {
        this.reten5Rate = reten5Rate;
    }

    @Override
    public String toString() {
        return "UserRetentionAnalysis{" +
                "day='" + day + '\'' +
                ", reten1Rate=" + reten1Rate +
                ", reten3Rate=" + reten3Rate +
                ", reten5Rate=" + reten5Rate +
                '}';
    }
}
