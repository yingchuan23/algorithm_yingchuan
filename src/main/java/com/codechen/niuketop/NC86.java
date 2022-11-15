package com.codechen.niuketop;

public class NC86 {


    public int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
        int[] res = new int[2];
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j <= m - 1) {
            if (mat[i][j] == x) {
                res[0] = i;
                res[1] = j;
                return res;
            } else if (mat[i][j] > x) {
                i--;

            } else {
                j++;
            }

        }
        return res;
    }
}
