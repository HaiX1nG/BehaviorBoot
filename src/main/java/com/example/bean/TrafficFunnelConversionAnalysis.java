package com.example.bean;

public class TrafficFunnelConversionAnalysis {
    private String name;
    private Long value;
    private double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "TrafficFunnelConversionAnalysis{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", rate=" + rate +
                '}';
    }
}
