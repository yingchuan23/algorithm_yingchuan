package com.codechen.catalog.toflashback;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_131 {

    List<List<String>> list = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return list;
    }

    private void backtracking(String s, int start) {
        /*这个地方是要判断一下 我们的切割线是不是已经大于等于字符串的长度了*/
        if (start == s.length()) {
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            /*判断是不是回文*/
            if (isPalindrome(s, start, i)) {
                String substring = s.substring(start, i + 1);
                path.add(substring);
            } else {
                continue;
            }
            //起始位置后移，保证不重复
            backtracking(s, i + 1);
            path.removeLast();
        }

    }

    /*判断是不是回文子串*/
    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
