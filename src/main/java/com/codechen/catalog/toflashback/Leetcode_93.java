package com.codechen.catalog.toflashback;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_93 {

    List<String> result = new ArrayList<String>();


    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return result;
        }
        backtracking(s, 0, 0);
        return result;
    }

    private void backtracking(String s, int start, int pointnum) {
        /*因为是只有三个逗号   当是三个逗号之后*/
        if (pointnum == 3) {
            if (isValid(s, start, s.length() - 1)) {
                result.add(s);
            }
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isValid(s, start, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointnum++;
                backtracking(s, i + 2, pointnum);
                pointnum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                break;
            }
        }
    }


    //判断字符串是否合法
    /*我们所写的时双闭区间    */
    private Boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        /*这个地方判断的是  开头是不是零*/
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        /*定义一个sum数字*/
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
            sum = sum * 10 + (s.charAt(i) - '0');
            if (sum > 255) {
                return false;
            }
        }
        return true;
    }

}
