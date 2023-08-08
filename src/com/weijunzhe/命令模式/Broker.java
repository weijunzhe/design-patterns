package com.weijunzhe.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>命令调用类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 08:56
 **/

public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
