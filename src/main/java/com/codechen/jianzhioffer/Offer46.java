package com.codechen.jianzhioffer;

public class Offer46 {

    public int translateNum(int num) {
        String str = String.valueOf(num);
        int dudu1 = 1;
        int dudu2 = 1;
        for (int i = 2; i < str.length(); i++) {
            String temp = str.substring(i - 2, i);
            int dudu3 = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? dudu1 + dudu2 : dudu1;
            dudu1 = dudu2;
            dudu2 = dudu3;
        }

        return dudu1;
    }

}
