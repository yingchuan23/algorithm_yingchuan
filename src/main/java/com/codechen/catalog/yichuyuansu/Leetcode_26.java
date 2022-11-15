package com.codechen.catalog.yichuyuansu;

/**
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021-12-16 21:00
 **/
public class Leetcode_26 {


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
