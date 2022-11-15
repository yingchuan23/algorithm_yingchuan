package com.codechen.niuketop;

public class NC1 {

    public String solve(String s, String t) {
        StringBuilder stringBuilder = new StringBuilder();

        // write code here
        int carry = 0, i = s.length() - 1, j = t.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            carry += i < 0 ? 0 : s.charAt(i--) - '0';
            carry += j < 0 ? 0 : t.charAt(j--) - '0';

            stringBuilder.insert(0, carry % 10);
            carry = carry / 10;
        }

        return stringBuilder.toString();

    }

}
