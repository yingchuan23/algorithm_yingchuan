package com.codechen.catalog.binarySearch;

/**
 * @program: leetcode_chendeyou
 * @description: 基础二分查找
 * @author: miaocat19
 * @create: 2021-12-14 23:33
 **/
public class BsaeBinary {


    /*这个两个都是闭区间的情况*/
    public static int search(int[] nums, int target) {

        if (nums[0] > target || nums[nums.length - 1] < target) {
            return -1;
        }
        int left = 0, right = nums.length - 1;

        /*这里都是闭区间*/
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    /*这个是作闭，右开*/
    public static int search2(int[] nums, int target) {

        if (target < nums[0] || nums[nums.length - 1] < target) {
            return -1;
        }

        int left = 0;
        int right = nums.length;
        while (left < right) {

            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid ;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }


        return -1;

    }
}
