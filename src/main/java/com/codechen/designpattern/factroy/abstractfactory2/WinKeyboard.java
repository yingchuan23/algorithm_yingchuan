package com.codechen.designpattern.factroy.abstractfactory2;

public class WinKeyboard implements Keyboard{
    @Override
    public void input() {
        System.out.println("使用了win鼠标");
    }
}
