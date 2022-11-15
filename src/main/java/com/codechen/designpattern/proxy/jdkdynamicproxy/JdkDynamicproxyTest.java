package com.codechen.designpattern.proxy.jdkdynamicproxy;

/**
 * @PROJECT_NAME: leetcode_chendeyou
 * @DESCRIPTION:
 * @USER: 17800
 * @DATE: 2022/4/23 17:58
 */
public class JdkDynamicproxyTest {

    public static void main(String[] args) {
        SmsService proxy = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        proxy.send("你是猪");
    }

}
