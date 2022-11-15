package com.codechen.leetcode;

public class Leetcode931 {


    public int minFallingPathSum(int[][] matrix) {

        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j <= matrix.length - 1; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + matrix[i][j];
                } else if (j == matrix[0].length - 1) {
                    dp[i][j] = Math.min(dp[i + 1][j - 1], dp[i + 1][j]) + matrix[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j + 1], Math.min(dp[i + 1][j - 1], dp[i + 1][j])) + matrix[i][j];
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (res > dp[0][i]) {
                res = dp[0][i];
            }
        }
        return res;
    }


}
