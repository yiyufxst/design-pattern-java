package org.design.pattern.command.model.dish.impl;

import org.design.pattern.command.model.cook.Cook;
import org.design.pattern.command.model.dish.Dish;

/**
 * 油炸花生米
 */
public class FriedPeanuts extends Dish {

    public FriedPeanuts(Cook cook) {
        super(cook);
    }

    /**
     * 制作
     */
    @Override
    public void cook() {
        this.cook.cooking("油炸花生米");
    }
}
