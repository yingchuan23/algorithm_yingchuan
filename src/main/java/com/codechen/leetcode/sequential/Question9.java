package com.codechen.leetcode.sequential;

/**
 * @description: 回文数  121
 * @author: CodeJ
 * @create: 2021-05-27 23:34
 **/
public class Question9 {

    //本方是反转一半的数
    public boolean isPalindrome(int x) {

        /*首先判断一定不为回文数的情况*/
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reservNumber = 0;
        while (x > reservNumber) {
            reservNumber = reservNumber * 10 + x % 10;
            x = x / 10;
        }
        //偶数  奇数
        return reservNumber == x || x == reservNumber / 10;
    }

}
