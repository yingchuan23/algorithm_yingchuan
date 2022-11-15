package com.codechen.niuketop;

import java.util.ArrayList;

public class NC38 {


    public ArrayList<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return res;
        }

        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        int num = (right + 1) * (bottom + 1);

        while (num > 0) {
            //最上面的一行
            for (int i = left; i <= right && num >= 1; i++) {
                res.add(matrix[top][i]);
                num--;
            }
            top++;
            //最右边的一行v
            for (int i = top; i <= bottom && num >= 1; i++) {
                res.add(matrix[i][right]);
                num--;
            }
            right--;
            //最下面的一行
            for (int i = right; i >= left && num >= 1; i--) {
                res.add(matrix[bottom][i]);
                num--;
            }
            bottom--;
            //最下面的一行
            for (int i = bottom; i >= top && num >= 1; i--) {
                res.add(matrix[i][left]);
                num--;
            }
            left++;
        }
        return res;
    }
}
