package com.codechen.niuketop;

public class NC100 {


    public int StrToInt(String s) {
        // write code here
        int length = s.length() - 1;
        char[] chars = s.toCharArray();
        int index = 0;
        /*去除前面的空格*/
        while (index <= length && chars[index] == ' ') {
            index++;
            if (index > length) {
                return 0;
            }
        }
        /*再去除上面的空格之后 我们判断第一个是不是符号位*/
        int flag = 1;
        if (chars[index] == '+') {
            index++;
        } else if (chars[index] == '-') {
            index++;
            flag = -1;
        }
        int res = 0;
        while (index <= length) {
            char cur = chars[index];
            if (cur > '9' || cur < '0') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (cur - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && -(cur - '0') < Integer.MIN_VALUE % 10)) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + flag * (cur - '0');
            index++;
        }

        return res;
    }


}
