//package com.codechen.leetcode.search.binarysearch;
//
//import javax.print.attribute.standard.MediaSize;
//
///**
// * @className: com.codechen.leetcode.search.binarysearch.Question278
// * @description: 第一个错误的版本
// * @author: CodeJ
// * @create: 2021-07-12 15:08
// */
//public class Question278 {
//
//    public int firstBadVersion(int n) {
//        int left = 1, right = n;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)){  /*这个方法是leetcode的上面会给的api*/
//                right = mid;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return left;
//
//    }
//
//
//}
