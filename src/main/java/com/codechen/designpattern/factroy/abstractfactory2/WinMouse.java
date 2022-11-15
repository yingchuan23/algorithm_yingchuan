package com.codechen.designpattern.factroy.abstractfactory2;

public class WinMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("使用了mouse鼠标。。。。");
    }
}
