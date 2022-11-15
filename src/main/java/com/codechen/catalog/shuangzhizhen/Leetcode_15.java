package com.codechen.catalog.shuangzhizhen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*三数之和*/
public class Leetcode_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);


        /*进行便利*/
        for (int i = 0; i < nums.length; i++) {
            /*进行排序之后  第一个数就大yu0  直接挂掉*/
            if (nums[i] > 0) {
                return res;
            }

            /*去重*/
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[right] == nums[right--]) {
                        right--;
                    }
                    while (left < right && nums[left] == nums[left++]) {
                        left--;
                    }
                    left++;
                    right--;
                }

            }

        }

        return res;
    }
}



