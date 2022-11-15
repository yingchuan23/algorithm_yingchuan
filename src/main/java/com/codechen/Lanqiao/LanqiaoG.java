package com.codechen.Lanqiao;

import java.util.Scanner;

/**
 * @description: 小平方
 * @author: CodeJ
 * @create: 2021-05-09 10:14
 **/
public class LanqiaoG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*jishu*/
        int count = 0;
        for (int i = 1; i < n; i++) {
            if ((i*i % n) < ((double) n / 2)) {
                count++;
            }
        }
        System.out.println(count);
    }

}
