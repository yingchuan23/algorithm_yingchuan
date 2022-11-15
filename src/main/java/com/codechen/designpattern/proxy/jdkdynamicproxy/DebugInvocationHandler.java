package com.codechen.designpattern.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @PROJECT_NAME: leetcode_chendeyou
 * @DESCRIPTION: 调用处理器 动态代理的类
 * @USER: 17800
 * @DATE: 2022/4/23 15:19
 */
public class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用方法之前 ，我们可以自己操作一些东西
        System.out.println("before method " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after method " + method.getName());

        return result;
    }
}
