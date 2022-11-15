package com.codechen.designpattern.factroy.abstractfactory2;

public class WinFactory implements Hardware {
    @Override
    public Keyboard createKeyboard() {
        return new WinKeyboard();
    }

    @Override
    public Mouse cyeateMouse() {
        return new WinMouse();
    }
}
