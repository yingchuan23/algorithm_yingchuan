package com.codechen.catalog.sort;

import java.util.Arrays;

public class SelectSort_2 {


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 5, 6, 4, 3, 2, 1};
        selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectsort(int[] arr) {
        int i;
        int j;
        int min;
        for (i = 0; i <= arr.length - 1; i++) {
            min = i;
            for (j = i + 1; j <= arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

}
