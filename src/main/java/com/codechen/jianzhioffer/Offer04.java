package com.codechen.jianzhioffer;

public class Offer04 {


    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        /*列*/
        int column = 0;
        int row = matrix.length - 1;
        while (column <= matrix[0].length - 1 && row >= 0) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] > target) {
                row--;
            } else {
                column++;
            }

        }
        return false;
    }
}
