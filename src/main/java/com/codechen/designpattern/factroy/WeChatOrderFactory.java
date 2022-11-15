package com.codechen.designpattern.factroy;

public class WeChatOrderFactory implements IOrderFactory {
    @Override
    public IPay createPay() {
        return new WeChatPay();
    }

    @Override
    public IReFund createRefund() {
        return new WeChatRefund();
    }
}
