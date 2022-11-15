package com.codechen.zuo.day01;

/**
 * @program: leetcode_chendeyou
 * @description: maopao
 * @author: miaocat19
 * @create: 2021-11-19 20:59
 **/
public class Code02_SelectionSort {


    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] > arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }

    }


    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {

        int a[] = {3, 4, 5, 6, 7, 6, 7, 0};

        selectionSort(a);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
