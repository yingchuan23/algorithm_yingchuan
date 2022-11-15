package com.codechen.catalog.stringdudu;

public class Leetcode_jianzhioffer58 {


    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        StringBuilder sb = new StringBuilder(s);

        reverseString(sb, 0, n - 1);
        reverseString(sb, n, length - 1);
        return sb.reverse().toString();

    }

    private void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            end--;
            start++;
        }

    }

}
