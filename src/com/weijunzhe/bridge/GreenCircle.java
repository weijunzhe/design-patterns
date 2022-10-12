package com.weijunzhe.bridge;

/**
 * <h3>design-patterns</h3>
 * <p>绿色圆实现类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-12 21:24
 **/

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + "，x：" + x + "，y：" + y + "]");
    }
}
