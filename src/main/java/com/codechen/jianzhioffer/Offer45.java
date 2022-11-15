package com.codechen.jianzhioffer;

import java.util.ArrayList;

public class Offer45 {


    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quicksort(strs, 0, strs.length - 1);

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }


    public void quicksort(String[] strs, int L, int R) {
        if (L > R) {
            return;
        }
        int left = L;
        int right = R;
        String pivot = strs[left];

        while (left < right) {

            while (left < right && (strs[right] + pivot).compareTo(pivot + strs[right]) >= 0) {
                right--;
            }

            if (left < right) {
                strs[left] = strs[right];
            }

            while (left < right && (strs[left] + pivot).compareTo(pivot + strs[left]) <= 0) {
                left++;
            }

            if (left < right) {
                strs[right] = strs[left];
            }

            if (left >= right) {
                strs[left] = pivot;
            }

        }

        quicksort(strs, L, right - 1);
        quicksort(strs, right + 1, R);
    }


}
