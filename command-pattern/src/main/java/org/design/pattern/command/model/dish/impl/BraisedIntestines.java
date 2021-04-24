package org.design.pattern.command.model.dish.impl;

import org.design.pattern.command.model.cook.Cook;
import org.design.pattern.command.model.dish.Dish;

/**
 * 九转大肠
 */
public class BraisedIntestines extends Dish {

    public BraisedIntestines(Cook cook) {
        super(cook);
    }

    /**
     * 制作
     */
    @Override
    public void cook() {
        this.cook.cooking("九转大肠");
    }
}
