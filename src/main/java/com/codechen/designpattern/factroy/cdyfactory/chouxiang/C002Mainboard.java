package com.codechen.designpattern.factroy.cdyfactory.chouxiang;

import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.Mainboard;

public class C002Mainboard implements Mainboard {


    @Override
    public void unifiedproduce() {
        System.out.println("生产了C002Mainboard");
    }
}
