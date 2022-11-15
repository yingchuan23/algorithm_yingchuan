package com.codechen.niuketop;

public class NC19 {

    public int FindGreatestSumOfSubArray(int[] array) {
        int pre = 0;
        int max = array[0];
        for (int i : array) {
            pre = Math.max(pre + i, i);
            max = Math.max(max, pre);
        }
        return max;

    }

}
