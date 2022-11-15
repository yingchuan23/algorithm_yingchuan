package com.codechen.zuo.day01;

/**
 * @program: leetcode_chendeyou
 * @description: 二分查找
 * @author: miaocat19
 * @create: 2021-11-19 21:13
 **/
public class Code03_BSExist {

    public static boolean exist(int[] sortedArr, int num) {
        if (sortedArr == null || sortedArr.length == 0) {
            return false;
        }


        int L = 0;
        int R = sortedArr.length - 1;
        int mid = 0;

        while (L < R) { // L..R 至少两个数的时候
            mid = L + (( R - L ) >> 1);
        }

        if (sortedArr[mid] == num){
            return true;
        }else if (sortedArr[mid] > num){
            R = mid - 1;
        }else{
            L = mid + 1;
        }


        return sortedArr[L] == num;
    }
}
