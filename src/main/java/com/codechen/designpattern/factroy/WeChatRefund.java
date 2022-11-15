package com.codechen.designpattern.factroy;

public class WeChatRefund implements IReFund {
    @Override
    public void refund() {
        System.out.println("微信支付退款...");
    }
}