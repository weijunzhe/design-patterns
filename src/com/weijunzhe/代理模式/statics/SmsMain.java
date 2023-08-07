package com.weijunzhe.代理模式.statics;

/**
 * <h3>design-patterns</h3>
 * <p>mian方法</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:45
 **/

public class SmsMain {
    public static void main(String[] args) {
        SmsServiceImpl smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }
}
