package com.codechen.catalog.yichuyuansu;

/**
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021-12-16 20:41
 **/
public class Leetcode_27 {

    /*使用快慢指针的方法  也就时双指针的方法
     *
     * 这样看来 就是话   我们的空间复杂度是O(1)
     * 时间复杂度是O(n)
     * 要比暴力破解的快多了
     *
     *
     * */
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;

        for (slow = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = val;
                slow++;
            }
        }
        return slow;
    }
}
