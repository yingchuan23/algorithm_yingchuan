package com.codechen.designpattern.factroy.cdyfactory.chouxiang;

import com.codechen.designpattern.factroy.cdyfactory.chouxiang.inter.OrderFactory;

public class FactoryProducer {

    public static OrderFactory getFactory(String type) {

        if (type.equalsIgnoreCase("C001")) {
            return new C001OrderFactoy();
        } else if (type.equalsIgnoreCase("C002")) {
            return new C002OrderFactoy();
        }
        return null;
    }

}