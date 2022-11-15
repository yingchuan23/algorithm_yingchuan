package com.codechen.jianzhioffer;

public class Offer29 {


    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];

        int num = matrix.length * matrix[0].length;
        int left = 0;
        int right = matrix[0].length -1 ;
        int top = 0;
        int buttom = matrix.length - 1;
        int count = 0;


        while(num > 0){
            for(int i = left ; i <=right && num> 0 ; i++ ){
                res[count++] = matrix[top][i];
                num--;
            }
            top++;
            for(int i = top ; i <=buttom && num> 0 ; i++ ){
                res[count++] = matrix[i][right];
                num--;
            }
            right--;
            for(int i = right ; i >= left && num> 0 ; i-- ){
                res[count++] = matrix[buttom][i];
                num--;
            }
            buttom--;
            for(int i = buttom ; i >= top && num> 0 ; i-- ){
                res[count++] = matrix[i][left];
                num--;
            }
            left++;
        }

        return res;
    }




}
