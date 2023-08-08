package com.weijunzhe.命令模式;

/**
 * <h3>design-patterns</h3>
 * <p>买东西的命令</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 08:51
 **/

public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
