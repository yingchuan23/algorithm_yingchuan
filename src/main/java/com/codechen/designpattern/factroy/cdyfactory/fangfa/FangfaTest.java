package com.codechen.designpattern.factroy.cdyfactory.fangfa;

import com.codechen.designpattern.factroy.cdyfactory.fangfa.inter.Mainboard;
import com.codechen.designpattern.factroy.cdyfactory.fangfa.inter.MainboardFactory;

public class FangfaTest {


    public static void main(String[] args) {
        C001MainboardFactory mainboard001Factory = new C001MainboardFactory();
        Mainboard getmainboard = mainboard001Factory.getmainboard();
        getmainboard.unifiedproduce();
        C002MainboardFactory mainboard002Factory = new C002MainboardFactory();
        Mainboard getmainboard002 = mainboard002Factory.getmainboard();
        getmainboard002.unifiedproduce();
    }

}
