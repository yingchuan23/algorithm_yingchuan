package com.codechen.catalog.toflashback;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_17 {

    List<String> list = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits, numString, 0);
        return list;
    }


    StringBuilder temp = new StringBuilder();

    /*在这里编写回溯算法*/
    private void backTracking(String digits, String[] numString, int num) {
        if (num == digits.length()) {
            list.add(temp.toString());
            return;
        }
        /*str 表示数字对应的字符串*/
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTracking(digits, numString, num + 1);
            temp.deleteCharAt(temp.length() - 1);
        }

    }

}
