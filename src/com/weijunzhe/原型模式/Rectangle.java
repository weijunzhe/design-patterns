package com.weijunzhe.原型模式;

/**
 * <h3>design-patterns</h3>
 * <p>长方形</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-10 21:46
 **/

public class Rectangle extends Shape {

    public Rectangle() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
