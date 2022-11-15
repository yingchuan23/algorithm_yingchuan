package com.codechen.zuo.day01;

/**
 * @program: leetcode_chendeyou
 * @description: 判断局部最小   条件两个相邻的数一定不向相等，（这样就想明白判断了吧）
 * @author: miaocat19
 * @create: 2021-11-19 21:19
 **/
public class Code04_BSAwesome {

    public static int getLessIndex(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }


        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int left = 1;
        int right = arr.length - 2;
        int mid = 0;

       while (left < right) {
           mid = left + ((right - left) >> 1);
           if (arr[mid] > arr[mid - 1]){
               right = mid - 1;
           }else if (arr[mid] > arr[mid + 1]){
              left = mid + 1;
           }else{
               return mid;
           }
       }

        return left;
    }




}
