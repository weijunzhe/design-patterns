package com.weijunzhe.single;

/**
 * 单例模式(饿汉模式)
 */
public class SingleObject {
    // 提前实例化好一个对象
    private static SingleObject singleObject = new SingleObject();
    // 私有化构造方法，让外部不能new 对象
    private SingleObject() {

    }

    /**
     * 通过方法获取对象
     * @return
     */
    public static SingleObject getInstance() {
        return singleObject;
    }

    /**
     * 调用测试方法
     */
    public void showMessage() {
        System.err.println(getClass().getSimpleName() + " hello world");
    }
}
