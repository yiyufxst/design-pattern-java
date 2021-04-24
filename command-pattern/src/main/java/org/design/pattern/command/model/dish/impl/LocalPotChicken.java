package org.design.pattern.command.model.dish.impl;

import org.design.pattern.command.model.cook.Cook;
import org.design.pattern.command.model.dish.Dish;

/**
 * 地锅鸡
 */
public class LocalPotChicken extends Dish {

    public LocalPotChicken(Cook cook) {
        super(cook);
    }

    /**
     * 制作
     */
    @Override
    public void cook() {
        this.cook.cooking("地锅鸡");
    }
}
