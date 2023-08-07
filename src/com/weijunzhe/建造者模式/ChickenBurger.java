package com.weijunzhe.建造者模式;

/**
 * <h3>design-patterns</h3>
 * <p>鸡肉汉堡</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:22
 **/
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
