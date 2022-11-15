package com.codechen.zuo.day04;


/**
 * @program: leetcode_chendeyou
 * @description: 归并排序的两种实现方法
 * @author: miaocat19
 * @create: 2021-12-07 16:02
 **/
public class Code01_MergeSort {


    // 递归方法实现
    public static void mergeSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }


    private static void process(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + (r - l >> 1);
        process(arr, l, mid);
        process(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int[] helper = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= r) {
            helper[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }

        /*如果越界了  就是左右两边不一样其中一边有数剩余了*/

        while (p1 <= mid) {
            helper[i++] = arr[p1++];
        }

        while (p2 <= r) {
            helper[i++] = arr[p2++];
        }

        for (int j = 0; j < arr.length; j++) {
            arr[l + j] = helper[j];
        }
    }




    // 非递归实现归并排序
    public static void mergeSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        int mergelength = 1;

        //这个地方是判断的mergelength的大小是不是大于arr.length的打消了
        while (mergelength < n) {
            int l = 0;
            while (l < n) {

                //下面的两端代码主要是判断左组的
                //获取每一步中点的值
                int m = mergelength + l - 1;
                //在这里判断是不是中点大于最大长度了
                if (m >= n) {
                    break;
                }

                //这里主要是判断右组的边界的   判断你右边是不是超了    如果超了  就取剩余的部分
                int r = m + Math.min(mergelength, n - m - 1);

                //这里就是左组和右组之间进行merge
                merge(arr, l, m, r);
                //这里是我们进行左组位置的移动
                l = r + 1;
            }

            //这里是我们判断是不是n为int 类型最大值得时候 ，是不是步长在乘2 的时候越界了
            if (mergelength > n / 2) {
                break;
            }
            //步长乘2
            mergelength <<= 1;

        }

    }
}
