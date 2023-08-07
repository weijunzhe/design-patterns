package com.weijunzhe.责任链模式;

/**
 * <h3>design-patterns</h3>
 * <p>文件日志</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-07 14:26
 **/

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Logger: " + message);
    }
}
