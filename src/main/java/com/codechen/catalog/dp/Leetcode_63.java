package com.codechen.catalog.dp;

public class Leetcode_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        /*1、创建数组  这个二维数组的含义 还是他的每一个节点还是   从00 到这个节点的有多少条路径*/
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        /*初始化数组*/
        for (int i = 0; i < obstacleGrid.length && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < obstacleGrid[0].length && obstacleGrid[0][i] == 0; i++) {
            dp[0][i] = 1;
        }

        /*4、进行遍历*/
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

}
