package com.weijunzhe.外观模式;

/**
 * <h3>design-patterns</h3>
 * <p>圆形类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 16:24
 **/

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制一个圆形");
    }
}
