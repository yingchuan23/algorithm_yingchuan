package com.codechen.catalog.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode_49 {

    public List<List<String>> groupAnagrams(String[] strs) {


        if (strs.length == 0){
            return new ArrayList<List<String>>();
        }

        HashMap<String, List> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }

}
