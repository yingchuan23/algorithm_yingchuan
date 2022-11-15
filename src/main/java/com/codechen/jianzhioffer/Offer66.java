package com.codechen.jianzhioffer;

public class Offer66 {

    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        //left[i] 表示i左侧的乘机和  right同理
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        left[0] = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = a[i - 1] * left[i - 1];
        }

        right[a.length - 1] = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = left[i] * right[i];
        }
        return a;
    }


    //空间复杂度o(1)
    //这个地方默认的是返回数组不计入空间不复杂度
    public int[] constructArr2(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        //left[i] 表示i左侧的乘机和  right同理
        int[] left = new int[a.length];

        left[0] = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }

        int right = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            left[i] = left[i] * right;
            right *= a[i];
        }

        return left;
    }



}
