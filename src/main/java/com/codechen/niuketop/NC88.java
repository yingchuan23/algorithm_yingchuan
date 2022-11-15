package com.codechen.niuketop;

import java.util.Arrays;

/*这个是寻找第k大  这个应该是 倒排    可以正排   但是倒着输出就可以了*/
public class NC88 {

    public int findKth(int[] a, int n, int K) {
        // write code here
        quicksort(a, 0, a.length - 1);
        return a[K + 1];
    }


    /*快排*/
    private static void quicksort(int[] arr, int L, int R) {
        if (L > R) {
            return;
        }

        int left = L;
        int right = R;
        int pivot = arr[left];

        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
            }
            if (left >= right) {
                arr[left] = pivot;
            }
        }
        quicksort(arr, L, right - 1);
        quicksort(arr, right + 1, R);
    }

    public static void main(String[] args) {
        int[] ints = {13212, 31, 4, 5, 64, 7, 78, 34};
        quicksort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }
}
