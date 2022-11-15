package com.codechen.catalog.binarySearch;

/**
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021-12-15 16:00
 **/
public class Leetcode_35 {


    public int searchInsert(int[] nums, int target) {

        if (target < nums[0]) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;
        /*采取双闭区间的*/
        while (left <= right) {

            int mid = left + ((right - left) / 2);
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }

        return right + 1;
    }

}
