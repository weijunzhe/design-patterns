package com.weijunzhe.外观模式;

/**
 * <h3>design-patterns</h3>
 * <p>图形制作类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 16:25
 **/

public class ShapeMaker {

    private Shape rectangle;

    private Shape square;

    private Shape circle;


    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.square = new Square();
        this.circle = new Circle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }
    public void drawCircle() {
        circle.draw();
    }
}
