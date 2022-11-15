package com.codechen.designpattern.builder;

public interface Builder {

    /**
     * 接口方法
     */
    void buildCpu();

    void buildMainBoard();

    void buildDisk();

    void buildPower();

    void buildMemory();

    Computer createComputer();

}
