package com.weijunzhe.解释器模式;

/**
 * <h3>design-patterns</h3>
 * <p>并且判断器</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 09:20
 **/

public class AndExpression implements Expression {
    private Expression expr1 = null;

    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
