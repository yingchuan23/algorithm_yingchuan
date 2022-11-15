package com.codechen.zuo.day02;


/**
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021-11-22 22:57
 **/
public class Code01_dudu1 {


    public static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
        System.out.println(arr[i] + " " + arr[j]);
    }


    // arr中，只有一种数，出现奇数次
    public static void printOddTimesNum1(int[] arr) {
        int err = 0;
        for (int i = 0; i < arr.length; i++) {
            err ^= arr[i];
        }
        System.out.println(err);
    }


    // arr中，有两种数，出现奇数次
    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }

        int rightOne = eor & (-eor);

        int dudu = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((rightOne & eor) != 0) {
                dudu ^= arr[i];
            }
        }

        System.out.println("dudu" + dudu + "，另一个" + (dudu ^ eor));
    }


    // 请保证arr中，只有一种数出现了K次，其他数都出现了M次
    public static int onlyKTimes(int[] arr, int k, int m) {

        int[] t = new int[32];

        for (int num : arr) {
            for (int j = 0; j < 32; j++) {
                t[j] += (num >> j) & 1;
            }
        }
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            if (t[i] % m != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {6, 6, 4};
//        int i = 0;
//        int j = 1;
//        System.out.println(arr[i] + " " + arr[j]);
//        swap(arr, i, j);
//        System.out.println("----------------");
//        System.out.println(Integer.toBinaryString(9));
//        System.out.println(Integer.toBinaryString(~9));
        //

        int[] ints = {1, 1, 4, 4, 4, 5, 5, 5, 6, 6, 6};

        System.out.println(onlyKTimes(ints,2,3));


    }






}
