package com.codechen.niuketop;

import java.util.HashMap;

public class NC30 {


    public int minNumberDisappeared(int[] nums) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, num);
        }

        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(num)) {
                num++;
            } else {
                return num;
            }
        }
        return num;
    }
}
