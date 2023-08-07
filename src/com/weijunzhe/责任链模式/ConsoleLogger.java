package com.weijunzhe.责任链模式;

/**
 * <h3>design-patterns</h3>
 * <p>输出级日志</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 14:23
 **/

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("console: Logger: " + message);
    }
}
