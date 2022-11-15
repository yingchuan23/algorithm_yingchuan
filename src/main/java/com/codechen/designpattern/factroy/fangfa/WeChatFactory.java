package com.codechen.designpattern.factroy.fangfa;

/**
 * @Auther: csp1999
 * @Date: 2020/11/07/15:16
 * @Description: 具体工厂类 WeChatFactory
 */
public class WeChatFactory implements IPayFactory{
    @Override
    public IPay getPay() {
        return new WeChatPay();
    }
}
