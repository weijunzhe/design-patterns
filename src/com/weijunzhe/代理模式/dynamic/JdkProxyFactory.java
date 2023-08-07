package com.weijunzhe.代理模式.dynamic;

import java.lang.reflect.Proxy;

/**
 * <h3>design-patterns</h3>
 * <p>代理工厂类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 10:04
 **/

public class JdkProxyFactory {

    public static Object proxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DebugInvocationHandler(target)); // 代理对象对应的自定义 InvocationHandler
    }
}
