package com.codechen.catalog.sort;

import java.util.Arrays;
import java.util.Comparator;

/*选择排序*/
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 5, 6, 4, 3, 2, 1};
        selectsort(arr);
//        System.out.println(Arrays.toString(arr));
        String[] strings = {"7", "6", "8", "10"};

        quicksort(strings, 0, strings.length - 1);
        for (String string : strings) {
            System.out.println(string);
        }
    }


    public static void quicksort(String[] nums, int L, int R) {
        if (L > R) {
            return;
        }
        int left = L;
        int right = R;
        String pivot = nums[left];
        while (left < right) {
            while (left < right && Integer.valueOf(nums[right]) >= Integer.valueOf(pivot)) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
            }

            while (left < right && Integer.valueOf(nums[left]) <= Integer.valueOf(pivot)) {
                left++;
            }
            if (left < right) {
                nums[right] = nums[left];
            }
            if (left >= right) {
                nums[left] = pivot;
            }
        }

        quicksort(nums, L, left - 1);
        quicksort(nums, left + 1, R);
    }


    public static void selectsort(int[] arr) {
        /*定义三个变量*/
        /*有序数列的末尾的位置*/
        int i;
        /*无序序列的末尾的位置*/
        int j;
        /*无须序列中最小元素的位置*/
        int min;

        for (i = 0; i <= arr.length - 1; i++) {
            min = i;
            for (j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
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
