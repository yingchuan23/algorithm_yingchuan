package com.codechen.leetcode;

public class Leetcode1277 {


    public int countSquares(int[][] matrix) {
        int count = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    count += dp[i][j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Leetcode1277 leetcode1277 = new Leetcode1277();
        int[][] ints = {
                {0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}
        };
        int count = leetcode1277.countSquares(ints);
    }

}
