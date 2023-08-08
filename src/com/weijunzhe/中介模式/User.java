package com.weijunzhe.中介模式;

/**
 * @Description: TODO
 * @Author: weijunzhe
 * @Date: 2023/8/8 22:47
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg) {
        ChatRoom.showMessage(this, msg);
    }

}
