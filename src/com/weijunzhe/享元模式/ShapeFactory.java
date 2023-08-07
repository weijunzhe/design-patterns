package com.weijunzhe.享元模式;

import java.util.HashMap;

/**
 * <h3>design-patterns</h3>
 * <p>图形工厂类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 17:30
 **/

public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {

        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create circle of color: "+ color);
        }
        return circle;
    }
}
