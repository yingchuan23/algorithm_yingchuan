package com.codechen.designpattern.factroy;

public class AliPay implements IPay {

    @Override
    public void unifiedOrder() {
        System.out.println("支付宝支付 统一下单接口...");
    }
}