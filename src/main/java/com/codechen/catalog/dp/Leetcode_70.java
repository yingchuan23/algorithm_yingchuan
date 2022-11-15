package com.codechen.catalog.dp;

public class Leetcode_70 {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        /*1、确定dp数组*/
        int[] dp = new int[n + 1];

        /*3、初始化dp数组*/
        dp[1] = 1;
        dp[2] = 2;

        /*4、确定遍历顺序*/
        for (int i = 3; i < n + 1; i++) {
            /*2、确定递推公式*/
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
