package com.weijunzhe.bridge;

/**
 * <h3>design-patterns</h3>
 * <p>红色的圆实现类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-12 21:17
 **/

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + "，x：" + x + "，y：" + y + "]");
    }
}
