package com.codechen.designpattern.factroy.abstractfactory2;

public class MacFactory implements Hardware {


    @Override
    public Keyboard createKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Mouse cyeateMouse() {
        return new MacMouse();
    }
}
