package com.weijunzhe.单例模式;

/**
 * 懒汉模式
 * @author weijunzhe
 */
public class LazySingleObject {

    private static LazySingleObject lazySingleObject;

    private LazySingleObject() {

    }

    /**
     * 懒汉模式，默认先不创建，等使用时才判断要不要创建
     * @return
     */
    public static synchronized LazySingleObject getInstance() {
        if (lazySingleObject == null) {
            lazySingleObject = new LazySingleObject();
        }
        return lazySingleObject;
    }

    public void showMessage() {
        System.err.println(getClass().getSimpleName() + " hello world");
    }
}
