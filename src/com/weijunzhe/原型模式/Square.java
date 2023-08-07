package com.weijunzhe.原型模式;

/**
 * <h3>design-patterns</h3>
 * <p>正方形类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-10 21:48
 **/

public class Square extends Shape {

    public Square() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
