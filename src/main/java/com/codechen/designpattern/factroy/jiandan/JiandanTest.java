package com.codechen.designpattern.factroy.jiandan;

import org.junit.Test;

public class JiandanTest {


    @Test
    public void testSimpleFactory() {
        IPay wechat_pay = SimplePayFactory.createPay("WECHAT_PAY");
        IPay ali_pay = SimplePayFactory.createPay("ALI_PAY");
        wechat_pay.unifiedPay();
        ali_pay.unifiedPay();
    }

}
