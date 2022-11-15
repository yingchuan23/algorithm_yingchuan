package com.codechen.designpattern.factroy.cdyfactory.fangfa;


import com.codechen.designpattern.factroy.cdyfactory.fangfa.inter.Mainboard;

public class C001Mainboard implements Mainboard {


    @Override
    public void unifiedproduce() {
        System.out.println("生产了001的主板");
    }

}
