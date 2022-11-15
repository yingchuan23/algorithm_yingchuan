package com.codechen.designpattern.factroy.cdyfactory.chouxiang;

import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.CPU;
import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.OrderFactory;
import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.Mainboard;

public class C002OrderFactoy implements OrderFactory {

    @Override
    public CPU createCPU() {
        return new C002CPU();
    }

    @Override
    public Mainboard createMainboard() {
        return new C002Mainboard();
    }
}
