package com.codechen.niuketop;

public class NC141 {

    public boolean judge(String str) {
        // write code here
        //

        if (str == null || str.length() == 0) {
            return true;
        }

        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }


    /*leetcode9 回文数  这个题是不一样的  */
    public boolean isPalindrome(int x) {

        if (x < 0 || (x == x % 10 && x != 0)) {
            return false;
        }

        int reverseNumber = 0;
        while (x > reverseNumber) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x = x / 10;
        }

        return x == reverseNumber || x / 10 == reverseNumber;
    }
}
