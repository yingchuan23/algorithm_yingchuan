package com.codechen.leetcode;

public class Leetcode53 {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max= nums[0];
        for(int i = 0;i < nums.length ;i++){
            pre = Math.max(pre + nums[i],nums[i]);
            max = Math.max(max,pre);
        }
        return max;
    }

}
