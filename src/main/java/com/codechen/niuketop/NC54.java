package com.codechen.niuketop;

import org.omg.CORBA.UNKNOWN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NC54 {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            if (num[0] > 0) {
                return result;
            }

            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = num.length - 1;
            while (left < right) {
                if (num[i] + num[left] + num[right] > 0) {
                    right--;
                } else if (num[i] + num[left] + num[right] < 0) {
                    left++;
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    result.add(list);
                    while (left < right && num[left] == num[left + 1]) {
                        left++;
                    }
                    while (left < right && num[right] == num[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }

        return result;
    }

}
