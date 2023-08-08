package com.weijunzhe.中介模式;

/**
 * @Description: 聊天室类
 * @Author: weijunzhe
 * @Date: 2023/8/8 22:48
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "]:" + message);
    }
}
