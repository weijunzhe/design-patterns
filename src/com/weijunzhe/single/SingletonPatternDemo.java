package com.weijunzhe.single;

/**
 * 单例模式测试类
 * @author weijunzhe
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        // 通过静态方法获取对象，而不是new（饿汉模式）
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
        // synchronize懒汉模式
        LazySingleObject instance1 = LazySingleObject.getInstance();
        instance1.showMessage();
        // 双重锁
        LazySyncSingleObject instance2 = LazySyncSingleObject.getInstance();
        instance2.showMessage();
        // 静态内部类
        StaticSingleObject instance3 = StaticSingleObject.getInstance();
        instance3.showMessage();
        // 单例模式-枚举类
        Singleton.SINGLETON.showMessage();

    }
}
