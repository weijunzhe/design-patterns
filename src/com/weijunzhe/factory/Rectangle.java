package com.weijunzhe.factory;

/**
 * <h3>design-patterns</h3>
 * <p>长方形</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-12 11:55
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
