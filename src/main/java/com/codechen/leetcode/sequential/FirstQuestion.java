package com.codechen.leetcode.sequential;



import java.util.HashMap;
import java.util.Map;


/**
 * @description: 两数之和
 * @author: CodeJ
 * @create: 2021-05-03 23:09
 **/
public class FirstQuestion {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5};
        int target = 8;
        int[] sum = sum(nums, target);
        System.out.println(sum.length);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

    public static int[] sum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i],i);
        }

        return new int[0];

    }

}
