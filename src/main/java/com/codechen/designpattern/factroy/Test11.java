package com.codechen.designpattern.factroy;

import org.junit.Test;

public class Test11 {


    @Test
    public void testAbstractMethodPayFactory(){
        IOrderFactory wechatPayFactory = FactoryProducer.getFactory("WECHAT");
        wechatPayFactory.createPay().unifiedOrder();
        wechatPayFactory.createRefund().refund();
        IOrderFactory aliPayFactory = FactoryProducer.getFactory("ALI");
        aliPayFactory.createPay().unifiedOrder();
        aliPayFactory.createRefund().refund();
    }


}
