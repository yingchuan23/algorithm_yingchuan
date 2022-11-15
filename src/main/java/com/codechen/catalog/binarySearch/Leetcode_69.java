package com.codechen.catalog.binarySearch;

/**
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021-12-15 17:18
 **/
public class Leetcode_69 {


    public static int mySqrt(int x) {
        int left = 0, right = x, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid <= x){
                ans = mid;
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return ans;
    }



}
