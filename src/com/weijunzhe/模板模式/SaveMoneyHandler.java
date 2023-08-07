package com.weijunzhe.模板模式;

/**
 * <h3>design-patterns</h3>
 * <p>存钱业务</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:14
 **/

public class SaveMoneyHandler extends AbstractBusinessHandler {

    @Override
    protected void handle() {
        System.out.println("save 1000");
    }
}
