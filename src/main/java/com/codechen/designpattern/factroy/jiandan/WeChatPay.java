package com.codechen.designpattern.factroy.jiandan;

public class WeChatPay implements IPay{

    @Override
    public void unifiedPay() {
        System.out.println("微信支付统一下单...");
    }
}