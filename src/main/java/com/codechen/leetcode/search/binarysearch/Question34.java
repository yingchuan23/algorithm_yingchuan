package com.codechen.leetcode.search.binarysearch;

/**
 * @description: todo
 * @author: CodeJ
 * @create: 2021-07-14 22:45
 **/
public class Question34 {


    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return new int[]{-1, -1};
        }

        int firstPostion = findFirstPosition(nums, target);
        if (firstPostion == -1) {
            return new int[]{-1, -1};
        }
        int lastPostion = findLastPosition(nums, target);
        return new int[]{firstPostion, lastPostion};
    }

    private int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (nums[mid] < target) {
                /*现在区间[mid+1,right]*/
                left = mid + 1;
            } else if (nums[mid] == target) {
                /*区间[left,mid - 1]*/
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                /*现在区间[mid+1,right]*/
                left = mid + 1;
            } else if (nums[mid] == target) {
                /*区间[left,mid - 1]*/
                right = mid;
            } else {
                right = mid - 1;
            }
        }

        if (nums[left] == target) {
            return left;
        }

        return -1;
    }


}
