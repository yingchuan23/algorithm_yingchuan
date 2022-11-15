package com.codechen.catalog.shuangzhizhen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }


            for (int j = i + 1; j < nums.length; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (right > left) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[left] == nums[++left]) {
                            ++left;
                        }
                        while (right > left && nums[right] == nums[--right]) {
                            --right;
                        }
                        left++;
                        right--;
                    }

                }

            }
        }
        return res;
    }
}
