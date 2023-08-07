package com.weijunzhe.template;

/**
 * <h3>design-patterns</h3>
 * <p>取钱业务</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:19
 **/

public class DrawMoneyHandler extends AbstractBusinessHandler {

    @Override
    protected void handle() {
        System.out.println("取钱业务");
    }
}
