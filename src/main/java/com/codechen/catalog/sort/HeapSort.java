package com.codechen.catalog.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapsort(int[] arr) {
        /*第一次首先把这个无序的数组调整成大顶堆的结构*/
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustheap(arr, i, arr.length);
        }
        /*我们首先要交换的值 + 然后就是继续调整堆的结构*/
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustheap(arr, 0, i);
        }
    }


    /*调整成大顶堆*/
    public static void adjustheap(int[] arr, int parentIndex, int length) {
        /*用一个临时节点保存父节点*/
        int temp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;

        while (childIndex < length) {
            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) {
                childIndex++;
            }
            /*这个地方是不能替换成arr[parentIndex]的*/
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