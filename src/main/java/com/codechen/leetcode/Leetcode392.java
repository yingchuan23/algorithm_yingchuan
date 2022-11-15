package com.codechen.leetcode;

public class Leetcode392 {


    /*动态规划做题
    *
    * */
    public boolean isSubsequence(String s, String t) {
        boolean[][] dp = new boolean[s.length() + 1][t.length() + 1];

        for(int i = 0 ; i <= t.length();i++){
            dp[0][i] = true;
        }

        for(int i =  1; i <= s.length() ; i++){
            char char1  = s.charAt(i - 1);
            for(int j = 1; j <= t.length() ;j++){
                char char2 = t.charAt(j - 1);
                if(dp[i][j - 1]){
                    dp[i][j] = true;
                }else if(char1 == char2 && dp[i - 1][j - 1]){
                    dp[i][j] = true;
                }else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[s.length()][t.length()];
    }



    public boolean isSubsequence2(String s, String t) {

        int length1 = s.length();
        int length2 = t.length();

        int i = 0;
        int j = 0;
        while(i < length1 && j < length2){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == j;

    }

}
