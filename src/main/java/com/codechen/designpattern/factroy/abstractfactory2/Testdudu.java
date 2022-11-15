package com.codechen.designpattern.factroy.abstractfactory2;

import org.junit.Test;

public class Testdudu {

    @Test
    public void haha() {
        Hardware mac = FactoryProducer.getFactory("mac");
        mac.createKeyboard().input();
        mac.cyeateMouse().click();
    }
}
