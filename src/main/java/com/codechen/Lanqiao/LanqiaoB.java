package com.codechen.Lanqiao;

import java.math.BigInteger;

/**
 * @description: todo
 * @author: CodeJ
 * @create: 2021-05-09 09:13
 **/
public class LanqiaoB {

    public static void main(String[] args) {
        BigInteger count = new BigInteger("1");
        for (int i = 3; i <= 2021; i++) {
            if (i % 2 != 0) {
                BigInteger bigInteger1 = new BigInteger(String.valueOf(i));
                count = count.multiply(bigInteger1);
            }
        }
        System.out.println(count);
    }


}
