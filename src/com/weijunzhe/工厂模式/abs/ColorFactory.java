package com.weijunzhe.工厂模式.abs;

import com.weijunzhe.工厂模式.Shape;

/**
 * <h3>design-patterns</h3>
 * <p>颜色工厂</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 14:21
 **/

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
