package com.codechen.designpattern.factroy.cdyfactory.chouxiang;

import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.CPU;
import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.Mainboard;
import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.OrderFactory;


public class ChouxiangTest {

    public static void main(String[] args) {
        OrderFactory c001OrderFactory = FactoryProducer.getFactory("C001");
        CPU c001cpu = c001OrderFactory.createCPU();
        c001cpu.unifiedproduce();
        Mainboard c001mainboard = c001OrderFactory.createMainboard();
        c001mainboard.unifiedproduce();

        System.out.println("------------------------");

        OrderFactory c002OrderFactory = FactoryProducer.getFactory("C002");
        CPU c002cpu = c002OrderFactory.createCPU();
        c002cpu.unifiedproduce();
        Mainboard c002mainboard = c002OrderFactory.createMainboard();
        c002mainboard.unifiedproduce();

    }
}
