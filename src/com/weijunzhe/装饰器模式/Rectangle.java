package com.weijunzhe.装饰器模式;

/**
 * @Description: 长方形
 * @Author: weijunzhe
 * @Date: 2022/11/8 21:15
 */
public class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("Shape: 长方形");
    }
}
