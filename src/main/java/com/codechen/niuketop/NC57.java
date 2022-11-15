package com.codechen.niuketop;

public class NC57 {

    public int reverse(int x) {
        // write code here
        int res = 0;
        while (x != 0) {
            if (x > Integer.MAX_VALUE / 10 || x < Integer.MIN_VALUE) {
                return 0;
            }
            int temp = x % 10;
            x = x / 10;
            res = res * 10 + temp;

        }

        return res;
    }
}
