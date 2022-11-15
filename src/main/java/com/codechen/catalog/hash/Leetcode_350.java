package com.codechen.catalog.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_350 {
//
//    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
//
//        int[] intersect = intersect(nums1, nums2);
//    }


    public  int[] intersect(int[] nums1, int[] nums2) {

        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i : nums2) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }

        }

        ArrayList<Integer> resArray = new ArrayList<>();
        for (int i : nums1) {
            if (map1.containsKey(i) && map1.get(i) > 0) {
                resArray.add(i);
                Integer temp = map1.get(i) - 1;
                map1.put(i, temp);
            }
        }

        int[] res = new int[resArray.size()];


        int index = 0;
        for (Integer integer : resArray) {
            res[index++] = integer;
        }


        return res;
    }
}
