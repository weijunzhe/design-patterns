package com.weijunzhe.工厂模式.abs;

import com.weijunzhe.工厂模式.Shape;

/**
 * <h3>design-patterns</h3>
 * <p>抽象工厂测试类</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 14:27
 **/

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // 获取圆形
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        // 获取长方形
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        // 获取正方形
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // 获取红色
        Color red = colorFactory.getColor("RED");
        red.fill();

        // 获取蓝色
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();

        // 获取绿色
        Color green = colorFactory.getColor("GREEN");
        green.fill();

    }
}
