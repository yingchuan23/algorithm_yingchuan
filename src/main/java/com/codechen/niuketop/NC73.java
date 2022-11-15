package com.codechen.niuketop;

import java.util.HashMap;
import java.util.Map;

public class NC73 {

    public int MoreThanHalfNum_Solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int result = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (value < i.getValue()) {
                result = i.getKey();
                value = i.getValue();
            }
        }
        return result;
    }
}
