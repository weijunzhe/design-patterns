package com.weijunzhe.命令模式;

/**
 * <h3>design-patterns</h3>
 * <p>请求类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 08:51
 **/

public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void buy() {
        System.out.println(this + " bought");
    }

    public void shell() {
        System.out.println(this + " sold");
    }
}
