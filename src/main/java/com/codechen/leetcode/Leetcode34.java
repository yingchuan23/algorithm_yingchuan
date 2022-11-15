package com.codechen.leetcode;

public class Leetcode34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }

        int getright = getright(nums, target);
        int getleft = getleft(nums, target);

        return new int[]{getleft - 1, getright + 1};
    }


    public int getright(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        int rightBorder = left;

        return rightBorder;
    }


    public int getleft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int leftBorder = right;

        return leftBorder;
    }
}
