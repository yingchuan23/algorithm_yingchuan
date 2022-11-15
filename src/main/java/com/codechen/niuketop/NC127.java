package com.codechen.niuketop;

public class NC127 {

    public String LCS(String str1, String str2) {
        // write code here
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        dp[0][0] = 0;
        /*定义最长的长度*/
        int maxlength = 0;
        int maxlengthLast = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {

                    dp[i + 1][j + 1] = dp[i][j] + 1;

                    if (dp[i + 1][j + 1] > maxlength) {
                        maxlength = dp[i + 1][j + 1];
                        maxlengthLast = i;
                    }
                } else {
                    dp[i + 1][j + 1] = 0;
                }
            }
        }
        return str1.substring(maxlengthLast - maxlength + 1, maxlengthLast + 1);
    }
}
