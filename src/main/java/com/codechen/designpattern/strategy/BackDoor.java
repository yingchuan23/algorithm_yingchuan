package com.codechen.designpattern.strategy;
/*ConcreteStrategy*/
public class BackDoor implements IStrategy  {

    @Override
    public void operate() {
        System.out.println("找到乔国老帮忙，让吴国给孙权施加压力，使得孙权不能杀刘备");
    }

}
