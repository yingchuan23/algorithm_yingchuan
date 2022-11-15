package com.codechen.jianzhioffer;

public class Offer13 {


    int res = 0;

    public int movingCount(int m, int n, int k) {
        /*这个只是一个标记数组*/
        boolean[][] arr = new boolean[m][n];
        dfs(0, 0, m, n, k, arr);
        return res;
    }

    private void dfs(int i, int j, int m, int n, int k, boolean[][] arr) {
        if (i < 0 || i >= m || j < 0 || j >= n || arr[i][j]) {
            return;
        }
        //没有走过，先标记，在判断是否符合题意
        arr[i][j] = true;
        int sum = i / 10 + j / 10 + i % 10 + j % 10;
        if (sum > k) {
            return;
        }
        res++;
        dfs(i - 1, j, m, n, k, arr);
        dfs(i + 1, j, m, n, k, arr);
        dfs(i, j - 1, m, n, k, arr);
        dfs(i, j + 1, m, n, k, arr);
    }
}
