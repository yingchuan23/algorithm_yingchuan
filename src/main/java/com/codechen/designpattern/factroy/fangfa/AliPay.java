package com.codechen.designpattern.factroy.fangfa;

public class AliPay implements IPay {


    @Override
    public void unifiedPay() {
        System.out.println("使用支付宝进行下单。。。。。。。");
    }
}
