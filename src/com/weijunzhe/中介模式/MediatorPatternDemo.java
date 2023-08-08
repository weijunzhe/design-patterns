package com.weijunzhe.中介模式;

/**
 * @Description: 中介模式测试类
 * @Author: weijunzhe
 * @Date: 2023/8/8 22:50
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        ChatRoom chatRoom = new ChatRoom();
        chatRoom.showMessage(robert, "Hi! Robert!");
        chatRoom.showMessage(john, "Hello! John!");

    }
}
