package com.codechen.catalog.yichuyuansu;

/**
 * @program: leetcode_chendeyou
 * @description: 有序数的平方
 * @author: miaocat19
 * @create: 2021-12-17 19:31
 **/
public class Leetcode_977 {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int[] helper = new int[n];

        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                helper[pos] = nums[i] * nums[i];
                i++;
            }else{
                helper[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }
        return helper;
    }


}
