package com.codechen.jianzhioffer;

public class Offer58 {

    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        StringBuilder sb = new StringBuilder(s);

        reversehelper(sb, 0, n - 1);
        reversehelper(sb, n, length - 1);

        return sb.reverse().toString();
    }

    private void reversehelper(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
