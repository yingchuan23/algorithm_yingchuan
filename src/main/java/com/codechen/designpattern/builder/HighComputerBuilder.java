package com.codechen.designpattern.builder;

public class HighComputerBuilder implements Builder {

    private Computer computer = new Computer();


    @Override
    public void buildCpu() {
        computer.setCpu("高配 CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainboard("高配 主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("高配 磁盘");
    }

    @Override
    public void buildPower() {
        computer.setPower("高配 电源");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("高配 内存");
    }

    @Override
    public Computer createComputer() {
        return computer;// 返回computer对象
    }

}
