package com.codechen.catalog.stringdudu;

public class Leetcode_541 {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int start = i;

            /*这个是防止到最后的时候  不够的时候*/
            int end = Math.min(chars.length - 1, start + k - 1);
            while(start < end){
                chars[start] ^= chars[end];
                chars[end] ^= chars[start];
                chars[start] ^= chars[end];
                start++;
                end--;
            }
        }

        return new String(chars);
    }

}
