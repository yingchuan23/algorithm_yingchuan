package com.codechen.zuo.day01;

/**
 * @program: leetcode_chendeyou
 * @description: 二分查找  时间复杂度O(n^2)
 * @author: miaocat19
 * @create: 2021-11-19 20:49
 **/
public class Code01_InsertionSort {


    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j > 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int a[] = {3, 4, 5, 6, 7, 6, 7};
        insertionSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

}




