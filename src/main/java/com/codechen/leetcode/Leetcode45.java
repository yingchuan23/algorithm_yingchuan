package com.codechen.leetcode;

public class Leetcode45 {

    public static int jump(int[] nums) {
        int rightmost = 0;
        int end = 0;
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            rightmost = Math.max(rightmost, i + nums[i]);
            if (end == i) {
                end = rightmost;
                steps++;
            }
        }
        return steps;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 0, 0, 5};

        System.out.println(jump(nums));


    }
}
