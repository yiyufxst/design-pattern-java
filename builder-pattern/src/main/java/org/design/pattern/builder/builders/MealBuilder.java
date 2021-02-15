package org.design.pattern.builder.builders;

import lombok.Getter;
import lombok.Setter;
import org.design.pattern.builder.model.Goods;

import java.util.List;

/**
 * 年夜饭生成器
 */
@Getter
@Setter
public class MealBuilder {
    /**
     * 冷菜类
     */
    private List<Goods> coldDishes;

    /**
     * 热菜类
     */
    private List<Goods> hotDishes;

    /**
     * 主食
     */
    private Goods stapleFood;

    /**
     * 饮料
     */
    private Goods drink;

    /**
     * 获取花销
     * @return
     */
    public float getCost() {
        float result = 0.0f;
        result += getSingleDishesCost(coldDishes);
        result += getSingleDishesCost(hotDishes);
        result += stapleFood.getPrice();
        result += drink.getPrice();
        return result;
    }

    /**
     * 展示菜单
     */
    public void showMenu() {
        System.out.println("凉菜类：");
        showSingleDishesName(coldDishes);
        System.out.println("热菜类：");
        showSingleDishesName(hotDishes);
        System.out.println("主食：");
        System.out.println(stapleFood.getName());
        System.out.println("饮料：");
        System.out.println(drink.getName());
    }

    /**
     * 获取单类菜品价格
     * @param goodsList
     * @return
     */
    private float getSingleDishesCost(List<Goods> goodsList) {
        float result = 0.0f;
        for (Goods goods : goodsList) {
            result += goods.getPrice();
        }
        return result;
    }

    /**
     * 展示单类菜品菜单
     * @param goodsList
     */
    private void showSingleDishesName(List<Goods> goodsList) {
        for (Goods goods : goodsList) {
            System.out.println(goods.getName());
        }
    }
}
