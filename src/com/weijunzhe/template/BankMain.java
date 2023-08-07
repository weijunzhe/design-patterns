package com.weijunzhe.template;

/**
 * <h3>design-patterns</h3>
 * <p>main方法</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 09:20
 **/

public class BankMain {

    public static void main(String[] args) {
        SaveMoneyHandler saveMoneyHandler = new SaveMoneyHandler();
        DrawMoneyHandler drawMoneyHandler = new DrawMoneyHandler();
        saveMoneyHandler.execution();
        drawMoneyHandler.execution();
    }
}
