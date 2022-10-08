package com.weijunzhe.single;

/**
 * <h3>design-patterns</h3>
 * <p>静态内部类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-08 19:39
 **/

public class StaticSingleObject {

    public static class SingleHolder {
        private static final StaticSingleObject singleObject = new StaticSingleObject();
    }

    private StaticSingleObject () {

    }

    public static final StaticSingleObject getInstance() {
        return SingleHolder.singleObject;
    }

    public void showMessage() {
        System.err.println(getClass().getSimpleName() + " hello world");
    }
}
