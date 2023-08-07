package com.weijunzhe.建造者模式;

/**
 * <h3>design-patterns</h3>
 * <p>物品|食物类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:15
 **/

public interface Item {
    /**
     * 食物名称
     */
    public String name();

    /**
     * 包装
     */
    public Packing packing();

    /**
     * 价格
     */
    public float price();
}
