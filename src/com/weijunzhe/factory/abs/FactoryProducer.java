package com.weijunzhe.factory.abs;

/**
 * <h3>design-patterns</h3>
 * <p>工厂创造器/生成器类</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 14:25
 **/

public class FactoryProducer {

    /**
     * 创建工厂方法
     * @param choice
     * @return
     */
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        return null;
    }
}
