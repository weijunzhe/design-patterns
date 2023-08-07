package com.weijunzhe.责任链模式;

/**
 * <h3>design-patterns</h3>
 * <p>错误日志</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 14:25
 **/
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }
}
