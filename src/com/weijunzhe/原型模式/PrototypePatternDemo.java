package com.weijunzhe.原型模式;

/**
 * <h3>design-patterns</h3>
 * <p>原型模式测试类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-10 21:55
 **/

public class PrototypePatternDemo {

    public static void main(String[] args) {
        // 初始化
        ShapeCache.loadCache();

        // 调用
        Shape shape = ShapeCache.getShape("1");
        System.out.println("Shape: "+ shape.getType());
        shape.draw();

        Shape shape1 = ShapeCache.getShape("2");
        System.out.println("Shape: "+ shape1.getType());
        shape1.draw();

        Shape shape2 = ShapeCache.getShape("3");
        System.out.println("Shape: " + shape2.getType());
        shape2.draw();
    }
}
