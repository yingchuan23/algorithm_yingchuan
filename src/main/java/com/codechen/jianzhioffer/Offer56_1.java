package com.codechen.jianzhioffer;

import java.util.Vector;

public class Offer56_1 {

    public int[] singleNumbers(int[] nums) {
        int x = 0;
        int y = 0;
        int m = 1;
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        while ((n & m) == 0) {
            m <<= 1;
        }
        for (int num : nums) {
            if ((num & m) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        return new int[]{x, y};
    }


}
