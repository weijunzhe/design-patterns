package com.weijunzhe.template;

import java.util.UUID;

/**
 * <h3>design-patterns</h3>
 * <p>模板模式设计的抽象类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:06
 **/

public abstract class AbstractBusinessHandler {
    /**
     * 模板方法
     */
    public final void execution() {
        getNumber();
        handle();
        judge();
    }

    /**
     * 取号
     */
    private void getNumber() {
        System.out.println("number-" + UUID.randomUUID());
    }

    /**
     * 评价
     */
    private void judge() {
        System.out.println("给个好评");
    }

    /**
     * 办理业务
     */
    protected abstract void handle();


}
