package com.weijunzhe.解释器模式;

/**
 * <h3>design-patterns</h3>
 * <p>终端类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 09:06
 **/

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
