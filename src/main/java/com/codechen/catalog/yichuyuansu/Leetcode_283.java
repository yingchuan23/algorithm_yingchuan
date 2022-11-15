package com.codechen.catalog.yichuyuansu;

/**
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021-12-16 21:08
 **/
public class Leetcode_283 {


    /*这个还是利用了双指针的思想
     *
     * 双指针
     *
     * 对于这个题目就是判断这个数字 是不是零
     * 因为fast跑的快  如果是的话
     *
     * 就让fast的位置和那个位置交换下位置
     *
     * */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int tmp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow++] = tmp;
            }
            fast++;
        }
    }
}
