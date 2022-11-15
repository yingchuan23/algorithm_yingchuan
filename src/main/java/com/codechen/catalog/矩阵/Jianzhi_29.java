package com.codechen.catalog.矩阵;

public class Jianzhi_29 {


    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int num = (right + 1) * (bottom + 1);


        int[] res = new int[num];


        int count = 0;
        while (num >= 1) {

            for (int i = left; i <= right && num >= 1; i++) {
                res[count] = matrix[top][i];
                count++;
                num--;
            }
            top++;

            for (int i = top; i <= bottom && num >= 1; i++) {
                res[count] = matrix[i][right];
                count++;
                num--;
            }
            right--;
            for (int i = right; i >= left && num >= 1; i--) {
                res[count] = matrix[bottom][i];
                count++;
                num--;
            }
            bottom--;
            for (int i = bottom; i >= top && num >= 1; i--) {
                res[count] = matrix[i][left];
                count++;
                num--;
            }
            left++;

        }


        return res;

    }


}
