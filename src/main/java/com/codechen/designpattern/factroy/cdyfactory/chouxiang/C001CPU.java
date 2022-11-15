package com.codechen.designpattern.factroy.cdyfactory.chouxiang;

import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.CPU;

public class C001CPU implements CPU {


    @Override
    public void unifiedproduce() {
        System.out.println("生产了001CPU");
    }

}
