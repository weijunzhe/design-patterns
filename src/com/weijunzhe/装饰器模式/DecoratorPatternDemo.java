package com.weijunzhe.装饰器模式;

/**
 * @Description: 测试类
 * @Author: weijunzhe
 * @Date: 2022/11/8 21:29
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();
    }
}
