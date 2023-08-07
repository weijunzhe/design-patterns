package com.weijunzhe.工厂模式.abs;

/**
 * <h3>design-patterns</h3>
 * <p>蓝色</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 10:42
 **/

public class Blue implements Color {

    @Override
    public void fill() {
        System.err.println("Inside Blue::fill() method.");
    }
}
