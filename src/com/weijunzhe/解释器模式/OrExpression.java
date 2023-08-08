package com.weijunzhe.解释器模式;

/**
 * <h3>design-patterns</h3>
 * <p>或者判断器</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 09:18
 **/

public class OrExpression implements Expression {
    private Expression expr1 = null;

    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
