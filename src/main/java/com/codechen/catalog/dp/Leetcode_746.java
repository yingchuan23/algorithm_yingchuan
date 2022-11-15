package com.codechen.catalog.dp;

public class Leetcode_746 {

    public int minCostClimbingStairs(int[] cost) {

        if (cost == null || cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }

        /*1、创建dp数组  确定dp数组的含义  dp[i]所定义的是到达i个  所花费的最小的体力  （注意我们这里认为的是第一步是一定要花费的）*/
        int[] dp = new int[cost.length];
        /*2、 dp[i]  = Math.min(dp[i - 1],dp[i -2]) + cost[i] 确定递推公式*/
        /*3、 初始化dp数组*/
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }

        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);

    }
}
