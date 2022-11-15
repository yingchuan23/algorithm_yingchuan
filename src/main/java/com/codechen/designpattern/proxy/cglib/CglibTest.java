package com.codechen.designpattern.proxy.cglib;

import java.util.AbstractList;

/**
 * @PROJECT_NAME: leetcode_chendeyou
 * @DESCRIPTION:
 * @USER: 17800
 * @DATE: 2022/4/23 18:27
 */
public class CglibTest {
    public static void main(String[] args) {
        AliSmsService proxy = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        proxy.send("java");
    }
}
