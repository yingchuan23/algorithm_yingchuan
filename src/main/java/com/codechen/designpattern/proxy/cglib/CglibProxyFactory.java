package com.codechen.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @PROJECT_NAME: leetcode_chendeyou
 * @DESCRIPTION:
 * @USER: 17800
 * @DATE: 2022/4/23 18:22
 */
public class CglibProxyFactory {

    public static Object getProxy(Class<?> clazz) {
        //创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        //设置被代理类
        enhancer.setClassLoader(clazz.getClassLoader());
        //设置被代理类
        enhancer.setSuperclass(clazz);
        //设置方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());
        //创建代理类
        return enhancer.create();
    }

}
