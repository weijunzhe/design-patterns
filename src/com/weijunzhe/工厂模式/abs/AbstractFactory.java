package com.weijunzhe.工厂模式.abs;

import com.weijunzhe.工厂模式.Shape;

/**
 * <h3>design-patterns</h3>
 * <p>抽象工厂</p>
 *
 * @author : weijunzhe
 * @date : 2022-08-15 10:43
 **/

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);


}
