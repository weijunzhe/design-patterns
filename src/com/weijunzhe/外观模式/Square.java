package com.weijunzhe.外观模式;

/**
 * <h3>design-patterns</h3>
 * <p>正方形类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 16:23
 **/

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制一个正方形");
    }
}
