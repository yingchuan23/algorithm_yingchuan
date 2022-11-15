package com.codechen.juc;


/*打印奇数偶数 volatile*/
public class Question002 {

    static volatile boolean flag = true;
    static int num = 1;

    public static void main(String[] args) {

        new Thread(() -> {
            while (num <= 100) {
                if (flag) {
                    System.out.println(Thread.currentThread().getName() + ":" + num++);
                    flag = false;
                }
            }
        }, "A").start();


        new Thread(() -> {
            while (num <= 100) {
                if (!flag) {
                    System.out.println(Thread.currentThread().getName() + ":" + num++);
                    flag = true;
                }
            }
        }, "B").start();


    }


}
