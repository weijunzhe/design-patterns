package com.weijunzhe.代理模式.statics;

/**
 * <h3>design-patterns</h3>
 * <p>发短信服务接口类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:41
 **/
public interface SmsService {
    /**
     * 发送方法
     * @param message 消息
     */
    void send(String message);
}
