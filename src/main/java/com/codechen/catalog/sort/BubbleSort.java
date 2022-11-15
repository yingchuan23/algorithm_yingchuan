package com.codechen.catalog.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = {124, 5, 67, 7, 8, 9};
        bubblesort(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
