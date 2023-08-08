package com.weijunzhe.解释器模式;

/**
 * <h3>design-patterns</h3>
 * <p>表达式接口</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 09:04
 **/
public interface Expression {

    boolean interpret(String context);
}
