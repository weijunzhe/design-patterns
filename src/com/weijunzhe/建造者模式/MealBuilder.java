package com.weijunzhe.建造者模式;

/**
 * <h3>design-patterns</h3>
 * <p>套餐生成器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:36
 **/

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
