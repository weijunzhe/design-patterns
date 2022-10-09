package com.weijunzhe.bulder;

/**
 * <h3>design-patterns</h3>
 * <p>可口可乐类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:20
 **/

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
