package com.weijunzhe.single;

/**
 * 懒汉模式
 * @author weijunzhe
 */
public class LazySyncSingleObject {

    // 关键字volatile的使用，可以保证变量可见性与原子性，同时还可以避免JVM对指令重排序。
    private volatile static LazySyncSingleObject lazySingleObject;

    private LazySyncSingleObject() {

    }

    /**
     * 懒汉模式，默认先不创建，等使用时才判断要不要创建
     * @return
     */
    public static LazySyncSingleObject getInstance() {
        // 先判断对象是否已经实例化，没有实例化则进入加锁代码
        if (lazySingleObject == null) {
            // 锁住类对象
            synchronized (LazySyncSingleObject.class) {
                // 判断是否已经实例化，防止多线程出现已经实例化的情况
                if (lazySingleObject == null) {
                    lazySingleObject = new LazySyncSingleObject();
                }
            }
        }
        return lazySingleObject;
    }

    public void showMessage() {
        System.err.println(getClass().getSimpleName() + " hello world");
    }
}
