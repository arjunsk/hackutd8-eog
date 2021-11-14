package com.drykode.hackutd.eog;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        int targetSum = 8;

        Point[][] points = {
                {
                        new Point(7, 30),
                        new Point(4, 20),
                        new Point(1, 10),
                        new Point(5, 4),
                        new Point(0, 0),
                        new Point(6, -20)
                },
                {
                        new Point(3, 50),
                        new Point(2, 40),
                        new Point(8, 20),
                        new Point(0, 0),
                        new Point(6, -10),
                        new Point(7, -20)
                }
        };

        List<Point> result = new MaxProfitMinFlowRateAlgo().solve(points, targetSum);
        result.forEach(System.out::println);
    }
}
