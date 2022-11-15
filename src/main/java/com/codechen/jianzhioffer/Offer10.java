package com.codechen.jianzhioffer;

public class Offer10 {


    public int numWays(int n) {
        final int mod = 1000000007;
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }


        return dp[n];
    }




}
