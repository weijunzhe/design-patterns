package com.weijunzhe.工厂模式;

/**
 * <h3>design-patterns</h3>
 * <p>形状工厂</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-12 11:52
 **/

public class ShapeFactory {
    /**
     * 获取形状
     * @param shapeType 形状类型
     * @return 形状对象
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
