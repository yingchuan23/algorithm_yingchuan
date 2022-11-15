package com.codechen.leetcode;

public class Leetcode221 {

    /*暴力*/
    public int maximalSquare(char[][] matrix) {
        int maxsize = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxsize;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '1') {
                    maxsize = Math.max(maxsize, 1);
                    int curmaxsizea = Math.min(rows - i, columns - j);
                    for (int k = 1; k < curmaxsizea; k++) {
                        boolean flag = true;
                        if (matrix[i + k][j + k] == '0') {
                            break;
                        }

                        for (int m = 0; m <= k; m++) {
                            if (matrix[i + k][j + m] == '0' || matrix[i + m][j + k] == '0') {
                                flag = false;
                                break;
                            }
                        }

                        if (flag) {
                            maxsize = Math.max(maxsize, k + 1);
                        } else {
                            break;
                        }
                    }
                }

            }
        }

        int maxs = maxsize * maxsize;

        return maxs;

    }


    //动态规划 dp[i][j] 代表当前位置的最大的正方形的编
    public int maximalSquare1(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int maxsize = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    if (j == 0 || i == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i][j], dp[i - 1][j])) + 1;
                    }
                }
                maxsize = Math.max(maxsize, dp[i][j]);
            }
        }

        int maxs = maxsize * maxsize;
        return maxs;

    }
}
