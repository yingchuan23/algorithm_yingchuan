package com.codechen.designpattern.factroy;

public class AliRefund implements IReFund {
    @Override
    public void refund() {
        System.out.println("支付宝退款...");
    }
}