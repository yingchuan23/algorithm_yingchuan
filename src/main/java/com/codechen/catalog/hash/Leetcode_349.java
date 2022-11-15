package com.codechen.catalog.hash;

import java.util.HashSet;

public class Leetcode_349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0 ){
            return new int[0];
        }
        HashSet<Integer> set1 = new HashSet<>();

        for (int i : nums2) {
            set1.add(i);
        }

        HashSet<Integer> res = new HashSet<>();
        for (int i : nums1) {
            if(set1.contains(i)){
                res.add(i);
            }
        }
        int[] resint = new int[res.size()];
        int index = 0;
        for (Integer i : res) {
            resint[index++] = i;
        }
        return resint;
    }
}
