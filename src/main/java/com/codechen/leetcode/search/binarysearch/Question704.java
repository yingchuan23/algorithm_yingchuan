package com.codechen.leetcode.search.binarysearch;

import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;

/**
 * @className: com.codechen.leetcode.search.binarysearch.Question704
 * @description: leetcode704
 * @author: CodeJ
 * @create: 2021-07-12 14:34
 */
public class Question704 {

    public static void main(String[] args) {
        System.out.println(1/2);
    }

    public int search(int[] nums, int target) {
        int pivot, left = 0, rihgt = nums.length -1 ;
        while (left <= rihgt) {
            pivot = left + (rihgt - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] > target) {
                rihgt = pivot - 1;
            } else {
                left =  pivot + 1;
            }
        }
        return -1;
    }


}
