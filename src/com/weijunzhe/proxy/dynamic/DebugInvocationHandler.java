package com.weijunzhe.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <h3>design-patterns</h3>
 * <p>动态代理类 </p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:59
 **/

public class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method " + method.getName());
        Object invoke = method.invoke(target, args);
        System.out.println("after method " + method.getName());
        return invoke;
    }

}
