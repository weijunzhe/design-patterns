package com.weijunzhe.代理模式.dynamic;

/**
 * <h3>design-patterns</h3>
 * <p>发送短信实现类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:57
 **/

public class SmsServiceImpl implements SmsService {

    @Override
    public void send(String message) {
        System.out.println("send message:" + message);
    }
}
