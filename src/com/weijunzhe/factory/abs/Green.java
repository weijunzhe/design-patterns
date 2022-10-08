package com.weijunzhe.factory.abs;

/**
 * <h3>design-patterns</h3>
 * <p>绿色</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 10:42
 **/

public class Green implements Color {

    @Override
    public void fill() {
        System.err.println("Inside Green::fill() method.");
    }
}
