package com.codechen.designpattern.singleton;

public class Singleton {


    // 添加volatile 关键字，禁止实例化对象时，内存模型中出现指令重排现象
    private static volatile Singleton instance;

    public static Singleton getInstance3plusplus() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
