package com.codechen.designpattern.proxy.staticdudu;

/**
 * @PROJECT_NAME: leetcode_chendeyou
 * @DESCRIPTION:
 * @USER: 17800
 * @DATE: 2022/4/23 15:01
 */
public class SmsProxy implements SmsService {

    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        System.out.println("before method send()");
        smsService.send(message);
        System.out.println("after method send()");
        return null;
    }




}
