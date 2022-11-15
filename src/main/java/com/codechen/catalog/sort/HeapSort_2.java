package com.codechen.catalog.sort;

import java.util.Arrays;

public class HeapSort_2 {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapsort(int[] arr) {

        /*首先开始的时候 我们就要初始化成堆*/
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustheap(arr, i, arr.length);
        }

        /*在次,我们把堆第一个值进行交换到数组末尾的位置  然后在对出最后一个位置的地方进行再次调整成堆 */
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustheap(arr, 0, i);
        }
    }


    /*调整堆的大小*/
    private static void adjustheap(int[] arr, int parentIndex, int length) {
        int temp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) {
                childIndex++;
            }
            if (temp >= arr[childIndex]) {
                break;
            }
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        arr[parentIndex] = temp;
    }
}
