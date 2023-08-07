package com.weijunzhe.责任链模式;

/**
 * <h3>design-patterns</h3>
 * <p>责任链模式</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 14:27
 **/

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChainOfLoggers();
        chainOfLoggers.logMessage(AbstractLogger.INFO, "this is an infomation");

        chainOfLoggers.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        chainOfLoggers.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
