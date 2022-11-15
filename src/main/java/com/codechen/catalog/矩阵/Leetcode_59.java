package com.codechen.catalog.矩阵;


//螺旋矩阵
public class Leetcode_59 {


    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];

        //圈数
        int loop = n / 2;

        // 控制长度
        int offset = 1;

        //定义每一圈的起始位置
        int startX = 0;
        int startY = 0;

        //填入的数字
        int count = 1;

        //中位数
        int mid = n / 2;

        int i, j;

        while (loop > 0) {

            i = startX;
            j = startY;

            //上  从左到右
            for (; j < startY + n - offset; ++j) {
                res[startX][j] = count++;
            }

            // 右侧  从上倒下
            for (; i < startX + n - offset; ++i) {
                res[i][j] = count++;
            }

            // 下侧  从右到左
            for (; j > startY; j--) {
                res[i][j] = count++;
            }

            //左侧   从下到上
            for (; i > startX; i--) {
                res[i][j] = count++;
            }


            startY++;
            startX++;

            loop--;

            offset += 2;


        }

        if (n % 2 == 1) {
            res[mid][mid] = count;
        }

        return res;
    }




}
