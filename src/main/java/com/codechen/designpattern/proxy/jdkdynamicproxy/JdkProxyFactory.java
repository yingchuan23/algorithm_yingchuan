package com.codechen.designpattern.proxy.jdkdynamicproxy;


import java.lang.reflect.Proxy;

public class JdkProxyFactory {


    public static Object getProxy(Object target) {

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标类的类加载
                target.getClass().getInterfaces(), //代理需要实现的接口 ，可以指定多个
                new DebugInvocationHandler(target)); //代理对象自定义的 invocationhandler
    }
}