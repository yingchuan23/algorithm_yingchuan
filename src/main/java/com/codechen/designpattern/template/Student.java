package com.codechen.designpattern.template;

public class Student extends AbstractPerson {


    @Override
    protected void dressUp() {
        System.out.println("穿校服。。。。");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("吃妈妈的早饭。。。");
    }

    @Override
    protected void takeThings() {
        System.out.println("整理自己的书包。。。。");
    }
}
