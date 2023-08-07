package com.weijunzhe.原型模式;

import java.util.Hashtable;

/**
 * <h3>design-patterns</h3>
 * <p>原型仓库</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-10 21:50
 **/

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        return shape.clone();
    }

    /**
     *  初始化时，创建三种形状对象
     *  使用时，则调用对象的clone方法
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);

    }
}
