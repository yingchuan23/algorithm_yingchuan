package com.codechen.designpattern.factroy.fangfa;

/**
 * @Auther: csp1999
 * @Date: 2020/11/07/15:09
 * @Description: 具体工厂类 AliPayFactory
 */
public class AliPayFactory implements IPayFactory{
    @Override
    public IPay getPay() {
        return new AliPay();
    }
}
