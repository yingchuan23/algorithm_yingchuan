package com.codechen.leetcode;

import com.sun.org.glassfish.external.amx.AMX;

public class Leetcode213 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(getnum(nums, 0, nums.length - 2), getnum(nums, 1, nums.length - 1));
    }

    private int getnum(int[] nums, int start, int end) {

        int first = nums[start];
        int second = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i < end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
