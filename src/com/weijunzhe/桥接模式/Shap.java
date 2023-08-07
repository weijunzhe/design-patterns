package com.weijunzhe.桥接模式;

/**
 * <h3>design-patterns</h3>
 * <p>形状抽象类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-12 21:42
 **/

public abstract class Shap {

    protected DrawAPI drawAPI;

    protected Shap(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
