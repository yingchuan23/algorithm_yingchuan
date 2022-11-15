package com.codechen.catalog.dp;

public class Leetcode_343 {


    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        /*初始化数组*/
        dp[2] = 1;

        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j * (i - j)]));
            }
        }
        return dp[n];
    }

}
