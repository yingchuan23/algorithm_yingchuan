package com.codechen.designpattern.factroy.cdyfactory.chouxiang;


import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.Mainboard;

public class C001Mainboard implements Mainboard {

    @Override
    public void unifiedproduce() {
        System.out.println("生产了001的主板");
    }

}
