package com.codechen.leetcode;

public class Leetcode91 {

    public  int numDecodings(String s) {
        if (s.length() == 1 || s.charAt(0) == '0') {
            return 0;
        } else if (s.length() == 1 || s.charAt(0) != '0') {
            return 1;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < s.length() + 1; i++) {
            if (s.charAt(i) != '0') {
                dp[i] += dp[i - 1];
            }
            if (s.charAt(i - 2) != '0' && Integer.parseInt(s.substring(i - 2, i)) <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];

    }

    public static void main(String[] args) {
        Leetcode91 leetcode91 = new Leetcode91();
        int i = leetcode91.numDecodings("12");
        System.out.println(i);
    }


}
