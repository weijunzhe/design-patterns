package com.weijunzhe.factory;

/**
 * <h3>design-patterns</h3>
 * <p>测试方法</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-12 12:02
 **/

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // 获取圆形对象 调用draw方法
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        // 获取长方形对象 调用draw方法
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        // 获取正方形对象 调用draw方法
        Shape square = shapeFactory.getShape("Square");
        square.draw();

    }
}
