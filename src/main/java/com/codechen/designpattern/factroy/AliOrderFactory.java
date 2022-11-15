package com.codechen.designpattern.factroy;

public class AliOrderFactory implements IOrderFactory {
    @Override
    public IPay createPay() {
        return new AliPay();
    }

    @Override
    public IReFund createRefund() {
        return new AliRefund();
    }
}
