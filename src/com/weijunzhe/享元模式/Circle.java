package com.weijunzhe.享元模式;

/**
 * <h3>design-patterns</h3>
 * <p>圆形类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 17:14
 **/

public class Circle implements Shape {

    private String color;

    private int x;

    private int y;

    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
