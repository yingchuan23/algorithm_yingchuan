package com.codechen.catalog.dp;

public class Leetcode_62 {

    public int uniquePaths(int m, int n) {
        /*1、确定好数组的含义*/
        int[][] dp = new int[m][n];

        /*2、确定好递推公式 dp[m][n] = dp[m][n-1] + dp[m-1][n]*/

        /*3、初始化数组*/
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        /*4、遍历*/
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }



        return dp[m - 1][n - 1];
    }
}
