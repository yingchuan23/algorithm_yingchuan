package com.codechen.designpattern.factroy.abstractfactory2;

public class FactoryProducer {


    public static Hardware getFactory(String type) {
        if (type.equalsIgnoreCase("mac")) {
            return new MacFactory();
        } else if (type.equalsIgnoreCase("win")) {
            return new WinFactory();
        } else {
            return null;
        }
    }

}
