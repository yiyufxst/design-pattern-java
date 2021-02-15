package org.design.pattern.builder.test;

import org.design.pattern.builder.builders.MealBuilder;
import org.design.pattern.builder.director.MealDirector;
import org.junit.Test;

public class MealDirectorTest {
    @Test
    public void testConstructMeatDinner() {
        MealDirector mealDirector = new MealDirector();
        MealBuilder mealBuilder = mealDirector.constructMeatDinner();
        mealBuilder.showMenu();
        System.out.println("单人多肉年夜饭套餐花费：" + mealBuilder.getCost());
    }

    @Test
    public void testConstructMeanAndVegetablesDinner() {
        MealDirector mealDirector = new MealDirector();
        MealBuilder mealBuilder = mealDirector.constructMeanAndVegetablesDinner();
        mealBuilder.showMenu();
        mealBuilder.getCost();
        System.out.println("单人混合肉蔬年夜饭套餐：" + mealBuilder.getCost());
    }
}
