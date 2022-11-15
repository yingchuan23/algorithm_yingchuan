package com.codechen.designpattern.proxy.staticdudu;

/**
 * @PROJECT_NAME: leetcode_chendeyou
 * @DESCRIPTION:
 * @USER: 17800
 * @DATE: 2022/4/23 14:54
 */
public class SmsServiceImpl implements SmsService{


    @Override
    public String send(String message) {
        System.out.println(message);
        return message;
    }


}
