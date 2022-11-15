package com.codechen.catalog.hash;

import java.util.HashMap;

public class Leetcode_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0){
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp  = target - nums[i];
            if (map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i],i);
        }

        return res;
    }

}
