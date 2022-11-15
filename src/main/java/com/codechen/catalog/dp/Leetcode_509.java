package com.codechen.catalog.dp;

public class Leetcode_509 {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        /*1、确定dp数组*/
        int[] dp = new int[n + 1];
        /*2、确定递推公式*/
        /*dp[i] = dp[i-1] + p[i-2]*/
        /*3、dp数组的初始化*/
        dp[0] = 0;
        dp[1] = 1;
        /*4、确定便利的顺序*/
        /*这个地方是从前往后*/
        /*5、举例推导递推数组*/
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
