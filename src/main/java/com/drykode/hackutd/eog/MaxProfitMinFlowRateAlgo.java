package com.drykode.hackutd.eog;

import java.util.ArrayList;
import java.util.List;

public class MaxProfitMinFlowRateAlgo {
    int ansMaxFlow;
    List<Point> ansMaxProfitPoints;

    // Question Variables
    private Point[][] points;
    private int rows;
    private int cols;

    public List<Point> solve(Point[][] points, int targetSum) {

        this.rows = points.length;
        this.cols = points[0].length;

        this.points = points;
        this.ansMaxFlow = Integer.MIN_VALUE;

        bruteforce(-1, 0, 0, targetSum, new ArrayList<>());

        System.out.println("Max Flow Possible" + ansMaxFlow);

        return this.ansMaxProfitPoints;
    }

    public void bruteforce(int processIndex, int pointIndex, int profit, int currSum, List<Point> path) {

        if (processIndex >= rows || pointIndex >= cols) return;
        if (currSum < 0) return;

        if (processIndex == rows - 1) {
            if (profit > ansMaxFlow) {
                ansMaxFlow = profit;
                ansMaxProfitPoints = new ArrayList<>(path);
            }
            return;
        }

        for (int c = 0; c < cols; c++) {
            if (processIndex + 1 < rows) {
                path.add(points[processIndex + 1][c]);

                bruteforce(
                        processIndex + 1, c, profit + points[processIndex + 1][c].profit, currSum - points[processIndex + 1][c].flowRate, path);

                path.remove(path.size() - 1);
            }
        }
    }
}
