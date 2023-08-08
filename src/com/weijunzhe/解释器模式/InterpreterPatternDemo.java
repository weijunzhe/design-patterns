package com.weijunzhe.解释器模式;

/**
 * <h3>design-patterns</h3>
 * <p>解释器模式</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 09:21
 **/

public class InterpreterPatternDemo {
    /**
     * 定义规则
     */
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Rebert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * 定义规则
     */
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
    }

    public void test() {

    }
}
