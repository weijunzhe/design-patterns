package com.weijunzhe.建造者模式;

/**
 * <h3>design-patterns</h3>
 * <p>可口可乐</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:23
 **/

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
