package com.codechen.designpattern.factroy.cdyfactory.fangfa;


import com.codechen.designpattern.factroy.cdyfactory.fangfa.inter.Mainboard;

public class C002Mainboard implements Mainboard {

    @Override
    public void unifiedproduce() {
        System.out.printf("生产了002的主板");
    }

}
