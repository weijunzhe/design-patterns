package com.weijunzhe.factory;

/**
 * <h3>design-patterns</h3>
 * <p>圆形</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-12 11:56
 **/

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
