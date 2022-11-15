package com.codechen.niuketop;

import java.util.HashMap;
import java.util.Map;

public class NC61 {


    public int[] twoSum(int[] numbers, int target) {
        // write code here

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i};
            }
            map.put(numbers[i], i);
        }

        return new int[0];
    }
}
