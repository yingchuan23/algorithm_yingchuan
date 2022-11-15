package com.codechen.niuketop;

public class NC103 {


    public String solve(String str) {
        // write code here
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left < right) {
            chars[left] ^= chars[right];
            chars[right] ^= chars[left];
            chars[left] ^= chars[right];
            left++;
            right--;
        }
        return new String(chars);
    }
}
