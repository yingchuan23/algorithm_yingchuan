package com.codechen.zuo.day04;


/**
 * @program: leetcode_chendeyou
 * @description:在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。 输入一个数组，求出这个数组中的逆序对的总数。
 * @author: miaocat19
 * @create: 2021-12-12 21:32
 **/
public class Code03_ReversePair {

    public static int reverPairNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return process(arr, 0, arr.length - 1);
    }


    private static int process(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = l + (r - l >> 1);

        return process(arr, l, mid) +
                process(arr, mid + 1, r) +
                merge(arr, l, mid, r);
    }


    private static int merge(int[] arr, int l, int mid, int r) {

        int[] helper = new int[r - l + 1];
        int i = helper.length - 1;
        int p1 = mid;
        int p2 = r;
        int res = 0;

        while (p1 >= l && p2 > mid) {
            res += arr[p1] > arr[p2] ? (p2 - mid) : 0;
            helper[i--] = arr[p2] >= arr[p1] ? arr[p2--] : arr[p1--];
        }




        while (p1 >= l) {
            helper[i--] = arr[p1--];
        }

        while (p2 > mid) {
            helper[i--] = arr[p2--];
        }

        for (i = 0; i < helper.length; i++) {
            arr[l + i] = helper[i];
        }

        return res;
    }


}
