package com.codechen.designpattern.factroy.cdyfactory.chouxiang;

import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.CPU;
import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.OrderFactory;
import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.Mainboard;


public class C001OrderFactoy implements OrderFactory {


    @Override
    public CPU createCPU() {
        return new C001CPU();
    }

    @Override
    public Mainboard createMainboard() {
        return new C001Mainboard();
    }
}
