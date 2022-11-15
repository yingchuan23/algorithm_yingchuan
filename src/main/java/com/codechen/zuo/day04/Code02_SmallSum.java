package com.codechen.zuo.day04;


/**
 * @program: leetcode_chendeyou
 * @description:在一个数组中，每一个数把左边比自己小的数累加起来，最后把所有的和累加起来叫做这个数组的小和。
 * 也就是说，在数组中看这个数右边有几个数比自己大，
 * 如果有一个数比自己大，就是1乘以自身，如果有两个数比自己大，就是2乘以自身，最后把每个数得到的乘积相加。
 * @author: miaocat19
 * @create: 2021-12-07 19:56
 **/
public class Code02_SmallSum {

    public static int smallsum(int arr[]){
        if (arr ==null && arr.length <2 ){
            return 0;
        }
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        /*中点*/
        int mid = l + (r - l >> 1);

        return process(arr, l, mid)
                +process(arr,mid+1,r)
                + merge(arr,l,mid,r);
    }


    //在一个数字中 把比左边自己小的的数累加起来 ，求累加的和，/
    //这样也就是说   看 自己 把自己右边的数，有几个比自己大的  然后比如有5个   然后就拿这五个乘以自己的本身
    private static int merge(int[] arr, int l, int mid, int r) {
        int[] helper = new int[r - l + 1];

        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        int res = 0;

        while (p1 < mid && p2 < r) {
            res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            helper[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            helper[i++] = arr[p1++];
        }

        while(p2 <= r){
            helper[i++] = arr[p2++];
        }

        for (int j = 0; j < helper.length; j++) {
            arr[l + j] = helper[j++];
        }

        return res;
    }

}
