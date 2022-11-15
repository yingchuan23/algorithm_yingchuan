package com.codechen.lintcode;

/**
 * @description: todo
 * @author: CodeJ
 * @create: 2021-05-21 23:43
 **/
public class Coinchange {

    public static void main(String[] args) {

    }


    public int coinChange(int[] coins, int amount){

        int n = coins.length;
        int[] f = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (i >= f[i] &&  (f[i - coins[j]] != Integer.MAX_VALUE) ){
                    f[i] = Math.min(f[i - coins[j]]+1,f[i]);
                }
            }
        }

        // 随便写的
        return 1;

    }

}
