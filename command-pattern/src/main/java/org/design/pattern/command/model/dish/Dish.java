package org.design.pattern.command.model.dish;

import org.design.pattern.command.model.cook.Cook;

/**
 * 美食接口
 */
public abstract class Dish {

    /**
     * 厨师
     */
    protected Cook cook;

    public Dish(Cook cook) {
        this.cook = cook;
    }

    /**
     * 制作
     */
    abstract public void cook();
}
