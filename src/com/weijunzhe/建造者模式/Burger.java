package com.weijunzhe.建造者模式;

/**
 * <h3>design-patterns</h3>
 * <p>汉堡类，实现食物类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:18
 **/

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
