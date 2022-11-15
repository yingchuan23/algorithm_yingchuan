package com.codechen.juc;


/*打印奇数偶数 使用sychronized*/
public class Question001 {

    static final Object ob = new Object();
    static int num = 1;

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (ob) {
                while (num <= 100) {
                    /*偶数等待*/
                    if (num % 2 == 0) {
                        try {
                            ob.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + ":" + num++);
                        ob.notify();
                    }

                }

            }
        }, "A").start();


        new Thread(() -> {
            synchronized (ob) {
                while (num <= 100) {

                    if (num % 2 != 0) {
                        try {
                            ob.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + ":" + num++);
                        ob.notify();
                    }
                }
            }
        }, "B").start();

    }


}
