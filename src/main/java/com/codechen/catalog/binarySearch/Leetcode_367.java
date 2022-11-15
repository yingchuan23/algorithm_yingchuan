package com.codechen.catalog.binarySearch;

/**
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021-12-15 17:30
 **/
public class Leetcode_367 {

    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            long square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
