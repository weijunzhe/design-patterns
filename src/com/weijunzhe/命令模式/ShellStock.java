package com.weijunzhe.命令模式;

/**
 * <h3>design-patterns</h3>
 * <p>出售类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 08:55
 **/

public class ShellStock implements Order {

    private Stock stock;

    public ShellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.shell();
    }
}
