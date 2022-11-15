package com.codechen.catalog.sort;


import java.util.Arrays;

/*插入排序*/
public class InsertSort {

    public static void main(String[] args) {
        int[] ints = {1, 34, 5, 6, 757, 234, 3};
        insertsort(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void insertsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
