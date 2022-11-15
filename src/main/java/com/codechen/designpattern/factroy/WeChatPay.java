package com.codechen.designpattern.factroy;

public class WeChatPay implements IPay {
    @Override
    public void unifiedOrder() {
        System.out.println("微信支付统一下单...");
    }
}