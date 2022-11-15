package com.codechen.niuketop;

public class NC22 {

    /*我们这个是倒叙  把这几个数字 输入到A中*/
    public void merge(int A[], int m, int B[], int n) {
        int tailA = m - 1;
        int tailB = n - 1;
        int tail = m + n - 1;
        int temp = 0;

        while (tailA >= 0 || tailB >= 0) {
            if (tailA == -1) {
                temp = B[tailB--];
            } else if (tailB == -1) {
                temp = A[tailA--];
            } else if (A[tailA] > B[tailB]) {
                temp = A[tailA--];
            } else {
                temp = B[tailB--];
            }
            A[tail--] = temp;
        }
    }
}
