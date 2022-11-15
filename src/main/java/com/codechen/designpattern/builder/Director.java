package com.codechen.designpattern.builder;

public class Director {


    public Computer create(Builder builder) {
        builder.buildCpu();
        builder.buildDisk();
        builder.buildMemory();
        builder.buildPower();
        builder.buildMainBoard();
        /*创建一个电脑*/
        return builder.createComputer();
    }
}
