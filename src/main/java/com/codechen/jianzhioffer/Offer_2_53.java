package com.codechen.jianzhioffer;

public class Offer_2_53 {
    /*寻找不存在的数字*/
    public int missingNumber(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == mid) {
                start = start + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

}
