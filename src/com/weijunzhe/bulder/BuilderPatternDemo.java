package com.weijunzhe.bulder;

/**
 * <h3>design-patterns</h3>
 * <p>建造者模式演示</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:43
 **/

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        meal.showItems();
        System.out.println("Total Cost:" + meal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Mon Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());
    }
}
