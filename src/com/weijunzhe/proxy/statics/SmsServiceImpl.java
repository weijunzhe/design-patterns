package com.weijunzhe.proxy.statics;

/**
 * <h3>design-patterns</h3>
 * <p>短信实现类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:46
 **/
public class SmsServiceImpl implements SmsService {
    @Override
    public void send(String message) {
        System.out.println("发送短信:" + message);
    }
}
