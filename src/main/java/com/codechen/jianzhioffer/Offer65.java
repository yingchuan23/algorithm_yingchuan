package com.codechen.jianzhioffer;

public class Offer65 {

    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            c = b;
        }
        return a;
    }
}
