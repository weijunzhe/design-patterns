package com.weijunzhe.桥接模式;

/**
 * <h3>design-patterns</h3>
 * <p>桥接测试类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-12 21:54
 **/

public class BridgePatternDemo {

    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
