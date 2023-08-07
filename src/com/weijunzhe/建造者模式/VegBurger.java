package com.weijunzhe.建造者模式;

/**
 * <h3>design-patterns</h3>
 * <p>素食汉堡</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:38
 **/

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public float price() {
        return 30.5f;
    }
}
