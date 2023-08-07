package com.weijunzhe.责任链模式;

/**
 * <h3>design-patterns</h3>
 * <p>日志抽象类</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 14:01
 **/

public abstract class AbstractLogger {

    public static final int INFO = 1;

    public static final int DEBUG = 2;

    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }


    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

     protected abstract void write(String message);

}
