package com.codechen.jianzhioffer;

public class Offer16 {

    public double myPow(double x, int n) {
        if (x == 0) {
            return 1.0;
        }
        long b = n;
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        double res = 1.0;
        while (b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
