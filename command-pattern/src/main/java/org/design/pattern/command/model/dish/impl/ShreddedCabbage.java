package org.design.pattern.command.model.dish.impl;

import org.design.pattern.command.model.cook.Cook;
import org.design.pattern.command.model.dish.Dish;

/**
 * 手撕包菜
 */
public class ShreddedCabbage extends Dish {

    public ShreddedCabbage(Cook cook) {
        super(cook);
    }

    /**
     * 制作
     */
    @Override
    public void cook() {
        this.cook.cooking("手撕包菜");
    }
}
