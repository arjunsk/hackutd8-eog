package com.drykode.hackutd.eog;

public class Point {
    Integer profit;
    Integer flowRate;

    public Point(Integer flowRate, Integer profit) {
        this.flowRate = flowRate;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Point{" +
                "profit=" + profit +
                ", flowRate=" + flowRate +
                '}';
    }
}
