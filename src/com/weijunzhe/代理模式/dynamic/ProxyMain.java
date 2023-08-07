package com.weijunzhe.代理模式.dynamic;

/**
 * <h3>design-patterns</h3>
 * <p>main方法</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 11:37
 **/

public class ProxyMain {

    public static void main(String[] args) {
        SmsService smsService = (SmsService)JdkProxyFactory.proxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
