package com.weijunzhe.bulder;

/**
 * <h3>design-patterns</h3>
 * <p>百事可乐</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:24
 **/

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
