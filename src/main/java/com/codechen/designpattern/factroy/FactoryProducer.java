package com.codechen.designpattern.factroy;

public class FactoryProducer {

    public static IOrderFactory getFactory(String type) {

        if (type.equalsIgnoreCase("WECHAT")) {
            return new WeChatOrderFactory();
        } else if (type.equalsIgnoreCase("ALI")) {
            return new AliOrderFactory();
        }
        return null;
    }

}
