package com.weijunzhe.工厂模式;

/**
 * <h3>design-patterns</h3>
 * <p>正方形</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-12 11:56
 **/

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
