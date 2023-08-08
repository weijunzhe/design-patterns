package com.weijunzhe.命令模式;

/**
 * <h3>design-patterns</h3>
 * <p>命令模式测试类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 08:58
 **/

public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        ShellStock shellStock = new ShellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(shellStock);
        broker.takeOrder(shellStock);

        broker.placeOrders();
    }
}
