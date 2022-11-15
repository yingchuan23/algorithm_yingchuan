package com.codechen.leetcode.sequential;

/**
 * @description: 两数反转
 * @author: CodeJ
 * @create: 2021-05-21 19:34
 **/
public class Question7 {

    public static void main(String[] args) {
        Question7 question7 = new Question7();
        int reserve1 = question7.reserve(1534236469);
        System.out.println(reserve1);
    }

    public int reserve(int x) {
        int rev = 0;
        int digit = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            digit =  x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

}
