package com.weijunzhe.外观模式;

/**
 * <h3>design-patterns</h3>
 * <p>形状类main方法</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 16:28
 **/

public class ShapeDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
