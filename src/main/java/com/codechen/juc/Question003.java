package com.codechen.juc;


/*线程之间的交替打印*/
public class Question003 {

    static volatile int state = 0;
    static int num = 1;

    public static void main(String[] args) {
        new Thread(() -> {
            while (num <= 100) {
                if (state % 3 == 0) {
                    System.out.println(Thread.currentThread().getName());
                    state++;
                    num++;
                }
            }
        }, "A").start();

        new Thread(() -> {
            while (num <= 100) {
                if (state % 3 == 1) {
                    System.out.println(Thread.currentThread().getName());
                    state++;
                    num++;
                }
            }
        }, "B").start();

        new Thread(() -> {
            while (num <= 100) {
                if (state % 3 == 2) {
                    System.out.println(Thread.currentThread().getName());
                    state++;
                    num++;
                }
            }
        }, "C").start();

    }
}
