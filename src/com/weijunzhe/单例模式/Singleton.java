package com.weijunzhe.单例模式;

/**
 * <h3>design-patterns</h3>
 * <p>单例模式-枚举</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-08 19:48
 **/
public enum Singleton {
    SINGLETON;

    public void showMessage() {
        System.err.println(getClass().getSimpleName() + " hello world");
    }
}
