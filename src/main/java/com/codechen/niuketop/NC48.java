package com.codechen.niuketop;

import java.util.Stack;

public class NC48 {


    public int search(int[] nums, int target) {
        // write code here
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            /*表示前面的有序*/
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {

                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }

        }
        return -1;
    }


    public static void main(String[] args) {

        Stack<Integer> integers = new Stack<>();

    }
}
