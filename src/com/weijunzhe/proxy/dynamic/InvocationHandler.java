package com.weijunzhe.proxy.dynamic;

import java.lang.reflect.Method;

/**
 * <h3>design-patterns</h3>
 * <p>代理类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:52
 **/
public interface InvocationHandler {
    /**
     * 使用代理接口方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
