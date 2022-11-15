package com.codechen.jianzhioffer;

public class Offer56_2 {

    public int singleNumber(int[] nums) {
        int res = 0;
        int bit = 0;
        for (int i = 30; i >= 0; i--) {
            for (int num : nums) {
                bit += (num >> i) & 1;
            }
            res = res << 1;
            res += bit % 3;
            bit = 0;
        }
        return res;
    }

}
