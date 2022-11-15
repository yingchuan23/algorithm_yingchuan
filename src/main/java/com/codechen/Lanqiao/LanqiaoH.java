package com.codechen.Lanqiao;

import java.util.Scanner;

/**
 * @description: 完全平方数
 * @author: CodeJ
 * @create: 2021-05-09 10:35
 **/
public class LanqiaoH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int c = n * i;
            double sqrt = Math.sqrt(c);
            int a = (int) sqrt;
            if (sqrt - a == 0) {
                System.out.println(i);
                break;
            }
        }
    }


}
