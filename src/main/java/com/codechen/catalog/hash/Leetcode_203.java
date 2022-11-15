package com.codechen.catalog.hash;

import java.util.HashMap;
import java.util.HashSet;

/*快乐数*/
public class Leetcode_203 {

    public boolean isHappy(int n) {
        HashSet record = new HashSet();
        /*什么时候停止判断呢，这个就是要在n == 1  或者是陷入了死循环  */
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    private int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }


}
