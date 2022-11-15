package com.codechen.catalog.shuangzhizhen;


public class Leetcode_151 {


    public String reverseWords(String s) {

        /*先去除多余的空格   两边加上中间多余的*/
        StringBuilder sb = removeSpace(s);

        // 2.反转整个字符串
        reverseString(sb, 0, sb.length() - 1);

        // 3.反转各个单词
        reverseEachWord(sb);

        return sb.toString();
    }

    /*反转每一个单词*/
    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }

    /*反转string*/
    private void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    /*删除空格*/
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
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

}
