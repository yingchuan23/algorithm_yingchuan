package com.codechen.catalog.stringdudu;


public class Leetcode_151 {

    public String reverseWords(String s) {

        /*去除前后的字符串和  中间的多余的字符串   中间的字符串中空格   一个空中可能是两个空格*/
//        StringBuffer sb = removeSpace(s);
//
//        reverseString(sb, 0, sb.length() - 1);
//
//        reverseEachWords(sb);
//
//        return sb.toString();


        StringBuilder sb = removeSpace(s);
        // 2.反转整个字符串
        reverseString(sb, 0, sb.length() - 1);
        // 3.反转各个单词
        reverseEachWord(sb);
        return sb.toString();

    }


    /*去除多余的字符串*/
    private StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        StringBuilder sb = new StringBuilder();

        while (start <= end) {

            char c = s.charAt(start);
            /*对于这个地方的理解可以认为是  他这个当是有效的字母的时候直接添加      这个条件是其实是第一个空字符也是可以添加的， 但是的话，但是如果添加第二个空字符  就添加不了*/
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb;

    }


    /*反转字符串*/
    private void reverseString(StringBuilder sb, int start, int end) {

        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }


    /*反转每个单词*/
    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            /*防止移除   空的处理*/
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }
}
