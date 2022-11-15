package com.codechen.leetcode;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class Leetcode5 {

    /*暴力超时*/
    public String longestPalindrome1(String s) {
        String res = "";
        int maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (helper(substring) && substring.length() > maxlength) {
                    maxlength = substring.length();
                    res = substring;
                }
            }
        }
        return res;
    }

    private boolean helper(String substring) {
        for (int i = 0; i < substring.length() / 2; i++) {
            if (substring.charAt(i) != substring.charAt(substring.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    /*dp*/
    public String longestPalindrome(String s) {
        if (s.equals(""))
            return "";
        if (s.length() == 1) {
            return s;
        }
        String origin = s;
        String reverse = new StringBuilder(s).reverse().toString();
        int maxlength = 0;
        int maxend = 0;
        /*表示的是当前i节点最长回文长度*/
        int[][] dp = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (origin.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                }
                if (dp[i][j] > maxlength) {
                    int berforereverse = s.length() - 1 - j;
                    if (berforereverse + dp[i][j] - 1 == i) {
                        maxlength = dp[i][j];
                        /*这个i就是最后的位置*/
                        maxend = i;
                    }
                }
            }
        }
        return s.substring(maxend - maxlength + 1, maxend + 1);

    }

}
