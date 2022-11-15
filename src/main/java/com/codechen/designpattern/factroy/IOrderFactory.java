package com.codechen.designpattern.factroy;

public interface IOrderFactory {

    IPay createPay();

    IReFund createRefund();

}