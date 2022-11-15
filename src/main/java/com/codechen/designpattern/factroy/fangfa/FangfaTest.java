package com.codechen.designpattern.factroy.fangfa;

import org.junit.Test;

public class FangfaTest {


    @Test
    public void testMethodPayFactory() {
        AliPayFactory aliPayFactory = new AliPayFactory();
        IPay ali_pay = aliPayFactory.getPay();
        ali_pay.unifiedPay();// 输出：支付宝支付统一下单...
        WeChatFactory weChatFactory = new WeChatFactory();
        IPay wechat_pay = weChatFactory.getPay();
        wechat_pay.unifiedPay();// 输出：微信支付统一下单...
    }

}
