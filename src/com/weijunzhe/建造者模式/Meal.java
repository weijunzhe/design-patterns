package com.weijunzhe.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>套餐类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:25
 **/

public class Meal {

    List<Item> itemList = new ArrayList<>();

    /**
     * 添加商品
     * @param item 商品
     */
    public void addItem(Item item) {
        itemList.add(item);
    }

    /**
     * 结账
     * @return 金额
     */
    public float getCost() {
        return (float) itemList.parallelStream().mapToDouble(Item::price).sum();
    }

    /**
     * 打印小票
     */
    public void showItems() {
        itemList.forEach(item -> {
            System.out.print("Item: " + item.name());
            System.out.print("，Packing：" + item.packing().pack());
            System.out.println("，Price：" + item.price());
        });
    }
}
