package com.weijunzhe.原型模式;

/**
 * <h3>design-patterns</h3>
 * <p>圆形</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-10 21:49
 **/

public class Circle extends Shape {

    public Circle() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
