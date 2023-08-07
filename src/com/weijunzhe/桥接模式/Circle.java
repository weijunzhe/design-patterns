package com.weijunzhe.桥接模式;

/**
 * <h3>design-patterns</h3>
 * <p>圆</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-12 21:45
 **/

public class Circle extends Shap {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
