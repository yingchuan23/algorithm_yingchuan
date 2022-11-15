package com.codechen.niuketop;

import java.lang.reflect.Constructor;
import java.util.*;

public class NC97 {

    public String[][] topKstrings(String[] strings, int k) {
        // write code here
        if (k == 0) {
            return new String[0][0];
        }
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue()) == 0 ? o1.getKey().compareTo(o2.getKey()) : o2.getValue().compareTo(o1.getValue());
            }
        });

        String[][] res = new String[k][2];

        for (int i = 0; i < k; i++) {
            res[i][0] = list.get(i).getKey();
            res[i][1] = String.valueOf(list.get(i).getValue());
        }
        return res;
    }


    public static void main(String[] args) {
        NC97 nc97 = new NC97();
        int[] ints = nc97.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }


    /*leetcode_347*/
    public int[] topKFrequent(int[] nums, int k) {
        if (k == 0) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());


        int[][] res = new int[list.size()][2];


        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i).getKey();
            res[i][1] = list.get(i).getValue();
        }

        quicksort(res, 0, res.length - 1);

        int[] realres = new int[k];

        for (int i = res.length - 1, j = 0; i >= res.length - k; i--, j++) {
            realres[j] = res[i][0];
        }

        return realres;
    }


    private void quicksort(int[][] res, int L, int R) {
        if (L > R) {
            return;
        }
        int left = L;
        int right = R;
        int pivot = res[left][1];
        int pivotIndex = res[left][0];

        while (left < right) {

            while (left < right && res[right][1] >= pivot) {
                right--;
            }
            if (left < right) {
                res[left][1] = res[right][1];
                res[left][0] = res[right][0];
            }

            while (left < right && res[left][1] <= pivot) {
                left++;
            }

            if (left < right) {
                res[right][1] = res[left][1];
                res[right][0] = res[left][0];
            }

            if (left >= right) {
                res[left][1] = pivot;
                res[left][0] = pivotIndex;
            }

        }

        quicksort(res, L, right - 1);
        quicksort(res, right + 1, R);

    }

}
