package com.codechen.jianzhioffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Offer39 {

    //摩尔投票法
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
