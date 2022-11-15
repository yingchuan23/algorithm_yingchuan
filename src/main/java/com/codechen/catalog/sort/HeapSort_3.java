package com.codechen.catalog.sort;

import java.util.Arrays;

public class HeapSort_3 {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void heapsort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustheap(arr, 0, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustheap(arr, 0, i);
        }
    }

    /*调整成大顶堆*/
    public static void adjustheap(int[] arr, int parentIndex, int length) {
        int temp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            /*先判断是不是超过length */
            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) {
                childIndex++;
            }
            if (temp >= arr[childIndex]) {
                break;
            }
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * parentIndex + 1;
        }
        arr[parentIndex] = temp;
    }

}
