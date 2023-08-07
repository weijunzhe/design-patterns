package com.weijunzhe.工厂模式.abs;

import com.weijunzhe.工厂模式.Circle;
import com.weijunzhe.工厂模式.Rectangle;
import com.weijunzhe.工厂模式.Shape;
import com.weijunzhe.工厂模式.Square;

/**
 * <h3>design-patterns</h3>
 * <p>形状工厂</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 10:45
 **/

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
