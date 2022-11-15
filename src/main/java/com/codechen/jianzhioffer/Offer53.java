package com.codechen.jianzhioffer;

public class Offer53 {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        /*寻找有边界*/
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int right = start;
        // 若数组中无 target ，则提前返回
        if (end >= 0 && nums[end] != target) return 0;
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (  nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int left = end;
        return right - left - 1;
    }
}
