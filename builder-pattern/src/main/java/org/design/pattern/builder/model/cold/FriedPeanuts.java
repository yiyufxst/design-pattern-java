package org.design.pattern.builder.model.cold;

import org.design.pattern.builder.model.Goods;

/**
 * 油炸花生米
 */
public class FriedPeanuts implements Goods {
    @Override
    public String getName() {
        return "油炸花生米";
    }

    @Override
    public float getPrice() {
        return 9;
    }
}
