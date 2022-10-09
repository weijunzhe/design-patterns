package com.weijunzhe.bulder;

/**
 * <h3>design-patterns</h3>
 * <p>瓶子类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:17
 **/

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "瓶子打包";
    }
}
