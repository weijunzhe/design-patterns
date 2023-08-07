package com.weijunzhe.装饰器模式;

/**
 * @Description: 圆形
 * @Author: weijunzhe
 * @Date: 2022/11/8 21:16
 */
public class Circle implements Shape {
    /**
     * 画形状
     */
    @Override
    public void draw() {
        System.out.println("Shape: 圆形");
    }
}
