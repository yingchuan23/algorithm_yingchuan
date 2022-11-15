package com.codechen.designpattern.factroy.jiandan;

public class SimplePayFactory {

    /**
     * 工厂创建方法：
     * 根据参数返回对应的支付对象
     *
     * @param payType
     * @return
     */
    public static IPay createPay(String payType) {
        if (payType == null) {
            return null;
        } else if (payType.equalsIgnoreCase("WECHAT_PAY")) {
            return new WeChatPay();
        } else if (payType.equalsIgnoreCase("ALI_PAY")) {
            return new AliPay();
        }
        // 如果需要扩展，可以编写更剁
        return null;
    }




}