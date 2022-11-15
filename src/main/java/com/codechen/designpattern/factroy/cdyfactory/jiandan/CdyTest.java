package com.codechen.designpattern.factroy.cdyfactory.jiandan;

import com.codechen.designpattern.factroy.cdyfactory.jiandan.inter.Mainboard;

public class CdyTest {


    public static void main(String[] args) {
        Mainboard mainboard001 = SimpleMainboardFactory.createmainboard("mainboard001");
        mainboard001.unifiedproduce();
        Mainboard mainboard002 = SimpleMainboardFactory.createmainboard("mainboard002");
        mainboard002.unifiedproduce();
    }

}
