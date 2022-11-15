package com.codechen.designpattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @PROJECT_NAME: leetcode_chendeyou
 * @DESCRIPTION:
 * @USER: 17800
 * @DATE: 2022/4/23 18:17
 */
public class DebugMethodInterceptor implements MethodInterceptor {

    /**
     * @param o           被代理的对象（需要增强的对象）
     * @param method      被拦截的方法（需要增强的方法）
     * @param objects     方法参数
     * @param methodProxy 调用原始的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method " + method.getName());

        Object o1 = methodProxy.invokeSuper(o, objects);

        System.out.println("after method " + method.getName());
        return o1;
    }


}
