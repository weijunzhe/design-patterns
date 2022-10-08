package com.weijunzhe.factory.abs;

/**
 * <h3>design-patterns</h3>
 * <p>红色</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 10:41
 **/
public class Red implements Color {

    @Override
    public void fill() {
        System.err.println("Inside Red::fill() method.");
    }
}
