package com.codechen.catalog.sort;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergesort(int[] arr) {
        int[] temp = new int[arr.length];
        mergesort(arr, 0, arr.length - 1, temp);
    }

    private static void mergesort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergesort(arr, left, mid, temp);
            mergesort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }


    /*对他进行merge*/
    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arr[j] >= arr[i]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= right) {
            temp[t++] = arr[j++];
        }

        /*把临时数组中的对象复制到原来的数组*/
        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
