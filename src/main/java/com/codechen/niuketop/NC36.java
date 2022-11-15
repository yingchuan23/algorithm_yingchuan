package com.codechen.niuketop;

public class NC36 {


    public int findMedianinTwoSortedAray(int[] arr1, int[] arr2) {
        // write code here
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return 0;
        }
        int left1 = 0;
        int right1 = arr1.length - 1;
        int left2 = 0;
        int right2 = arr2.length - 1;
        while (left1 < right1) {
            int mid1 = left1 + (right1 - left1) / 2;
            int mid2 = left2 + (right2 - left2) / 2;
            /*这个地方是 我们的意思的是为偶偶数的时候为offset*/
            int offset = ((right1 - left1 + 1) % 2) ^ 1;
            if (arr1[mid1] == arr2[mid2]) {
                return arr1[mid1];
            } else if (arr1[mid1] > arr2[mid2]) {
                right1 = mid1;
                left2 = mid2 + offset;
            } else {
                right2 = mid2;
                left1 = mid1 + offset;
            }
        }

        return Math.min(arr1[left1], arr2[left2]);
    }
}
