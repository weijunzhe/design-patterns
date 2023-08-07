package com.weijunzhe.装饰器模式;

/**
 * @Description: 形状修饰类
 * @Author: weijunzhe
 * @Date: 2022/11/8 21:23
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }
    /**
     * 画形状
     */
    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
