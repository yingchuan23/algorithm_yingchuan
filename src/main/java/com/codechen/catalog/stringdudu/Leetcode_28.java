package com.codechen.catalog.stringdudu;


/*第一次使用kmp   确实很头疼*/

public class Leetcode_28 {

    //前缀表（不减一）Java实现
    public int strStr(String haystack, String needle) {
        /*判空*/
        if (needle.length() == 0) {
            return 0;
        }
        /*创建一个next的数组*/
        int[] next = new int[needle.length()];
        /*初始化数组*/
        getNext(next, needle);

        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = next[j - 1];
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }

        return -1;
    }

    private void getNext(int[] next, String s) {
        /*前缀的末尾    最长相等前后缀的长度*/
        int j = 0;
        next[0] = 0;
        //i 代表后缀的末尾
        for (int i = 1; i < s.length(); i++) {
            /*这个地方判断是不是 后缀的末尾是不是等于后缀的末尾     */
            while (j > 0 && s.charAt(j) != s.charAt(i)) {
                j = next[j - 1];
            }
            /*前后缀相同的情况*/
            if (s.charAt(j) == s.charAt(i)) {
                j++;
            }
            /*进行赋值-----*/
            next[i] = j;
        }
    }


}
