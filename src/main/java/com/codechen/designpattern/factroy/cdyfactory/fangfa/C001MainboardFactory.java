package com.codechen.designpattern.factroy.cdyfactory.fangfa;

import com.codechen.designpattern.factroy.cdyfactory.fangfa.inter.Mainboard;
import com.codechen.designpattern.factroy.cdyfactory.fangfa.inter.MainboardFactory;

public class C001MainboardFactory implements MainboardFactory {


    @Override
    public Mainboard getmainboard() {
        return new C001Mainboard();
    }
}
