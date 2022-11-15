package com.codechen.jianzhioffer;

public class Offer40 {


    public int[] getLeastNumbers(int[] arr, int k) {
        quicksort(arr, 0, arr.length - 1);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    public void quicksort(int[] arr, int L, int R) {
        if (L > R) {
            return;
        }

        int left = L;
        int right = R;
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
            }

            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
            }
            if (left >= right) {
                arr[left] = pivot;
            }
        }

        quicksort(arr, L, right - 1);
        quicksort(arr, right + 1, R);
    }


   /* public static void main(String[] args) {
        int[] ints = {12, 32, 3, 5};
        Offer40 offer40 = new Offer40();
        int[] leastNumbers = offer40.getLeastNumbers(ints, 2);
        for (int leastNumber : leastNumbers) {
            System.out.println(leastNumber);
        }
    }*/


}
