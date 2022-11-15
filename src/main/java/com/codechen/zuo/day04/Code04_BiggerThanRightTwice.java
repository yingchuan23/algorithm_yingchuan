package com.codechen.zuo.day04;

/**
 * @program: leetcode_chendeyou
 * @description: 左边的树比右边的数大两倍
 * @author: miaocat19
 * @create: 2021-12-14 18:45
 **/
public class Code04_BiggerThanRightTwice {


    public static int biggerTwice(int[] arr) {

        if (arr == null || arr.length < 2) {
            return 0;
        }

        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        // l < r
        int mid = l + ((r - l) >> 1);

        return process(arr, l, mid) + process(arr, mid + 1, r) + merge(arr, l, mid, r);
    }


    /*zhe*/
    private static int merge(int[] arr, int l, int mid, int r) {

        /*O(n)*/
        int ans = 0;
        int windowR = mid + 1;
        for (int j = l; j <= mid; j++) {
            while (windowR <= r && arr[j] > (arr[windowR] * 2)) {
                windowR++;
            }
            ans += windowR - mid - 1;
        }

        /*O(n)*/
        int[] helper = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= r) {
            helper[i++] = arr[p1] > arr[p2] ? arr[p2++] : arr[p1++];
        }

        while (p1 <= mid) {
            helper[i++] = arr[p1++];
        }

        while (p2 <= r) {
            helper[i++] = arr[p2++];
        }

        for (i = 0; i < helper.length; i++) {
            arr[l + i] = helper[i];
        }

        return ans;
    }


}
