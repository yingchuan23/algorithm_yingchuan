package com.codechen.Lanqiao;

import com.sun.org.apache.bcel.internal.generic.INEG;

import java.util.Scanner;
import java.util.function.IntFunction;

/**
 * @description: todo
 * @author: CodeJ
 * @create: 2021-05-09 09:36
 **/
public class LanqiaoF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        int i4 = scanner.nextInt();
        int i5 = scanner.nextInt();
        int count = 0;
        int[] ints = {i1, i2, i3, i4, i5};
        for (int i = 0; i < ints.length; i++) {
            char[] chars = String.valueOf(ints[i]).toCharArray();
            if (chars[0] == chars[2] && (Integer.parseInt(String.valueOf(chars[3])) - Integer.parseInt(String.valueOf(chars[1])) == 1)) {
                count++;
            }
        }
        System.out.println(count);
    }

}
