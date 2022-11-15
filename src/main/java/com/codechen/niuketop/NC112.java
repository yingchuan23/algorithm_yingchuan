package com.codechen.niuketop;

public class NC112 {


    public String solve(int M, int N) {
        // write code here
        String t = "0123456789ABCDEF";
        if (M == 0) {
            return "0";
        }
        StringBuffer ans = new StringBuffer();
        boolean fu = false;
        if (M < 0) {
            fu = true;
            M = -M;
        }
        while (M != 0) {
            ans.append(t.charAt(M % N));
            M /= N;
        }
        if (fu) {
            ans.append('-');
        }
        return ans.reverse().toString();
    }

}
