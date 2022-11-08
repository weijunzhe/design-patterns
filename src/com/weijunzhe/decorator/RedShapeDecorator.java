package com.weijunzhe.decorator;

/**
 * @Description: 继承装饰类
 * @Author: weijunzhe
 * @Date: 2022/11/8 21:26
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    /**
     * 画形状
     */
    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratorShape);
    }

    /**
     * 装饰方法
     * @param decoratorShape 装饰形状类
     */
    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border color: red");
    }
}
