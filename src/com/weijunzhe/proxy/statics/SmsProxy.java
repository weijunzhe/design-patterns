package com.weijunzhe.proxy.statics;

/**
 * <h3>design-patterns</h3>
 * <p>短信代理类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:43
 **/

public class SmsProxy implements SmsService {

    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public void send(String message) {
        System.out.println("before method send()");
        smsService.send(message);
        System.out.println("after method send()");
    }
}
