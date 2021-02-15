package org.design.pattern.builder.director;

import org.design.pattern.builder.builders.MealBuilder;
import org.design.pattern.builder.model.Goods;
import org.design.pattern.builder.model.cold.BoiledPeanuts;
import org.design.pattern.builder.model.cold.FriedPeanuts;
import org.design.pattern.builder.model.drink.LaoShanBeer;
import org.design.pattern.builder.model.drink.WuSuBeer;
import org.design.pattern.builder.model.hot.*;
import org.design.pattern.builder.model.staple.Rice;

import java.util.ArrayList;
import java.util.List;

/**
 * 年夜饭主管类
 */
public class MealDirector {
    /**
     * 单人多肉年夜饭套餐
     * @return
     */
    public MealBuilder constructMeatDinner() {
        MealBuilder mealBuilder = new MealBuilder();
        //冷菜
        List<Goods> coldDishes = new ArrayList<>(1);
        coldDishes.add(new BoiledPeanuts());
        mealBuilder.setColdDishes(coldDishes);
        //热菜
        List<Goods> hotDishes = new ArrayList<Goods>(4);
        hotDishes.add(new KungPaoChicken());
        hotDishes.add(new FarmhouseFriedPork());
        hotDishes.add(new LocalPotChicken());
        hotDishes.add(new TujiaBraisedPork());
        mealBuilder.setHotDishes(hotDishes);
        //主食
        mealBuilder.setStapleFood(new Rice());
        //饮料
        mealBuilder.setDrink(new LaoShanBeer());
        return mealBuilder;
    }

    /**
     * 单人混合肉蔬年夜饭套餐
     * @return
     */
    public MealBuilder constructMeanAndVegetablesDinner() {
        MealBuilder mealBuilder = new MealBuilder();
        //冷菜
        List<Goods> coldDishes = new ArrayList<>(1);
        coldDishes.add(new FriedPeanuts());
        mealBuilder.setColdDishes(coldDishes);
        //热菜
        List<Goods> hotDishes = new ArrayList<Goods>(4);
        hotDishes.add(new MushuMeat());
        hotDishes.add(new SaltPepperTenderloin());
        hotDishes.add(new ShreddedCabbage());
        hotDishes.add(new DiSanXian());
        mealBuilder.setHotDishes(hotDishes);
        //主食
        mealBuilder.setStapleFood(new Rice());
        //饮料
        mealBuilder.setDrink(new WuSuBeer());
        return mealBuilder;
    }
}
