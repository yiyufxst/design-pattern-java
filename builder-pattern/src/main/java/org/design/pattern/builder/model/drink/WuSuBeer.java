package org.design.pattern.builder.model.drink;

import org.design.pattern.builder.model.Goods;

/**
 * 夺命大乌苏
 */
public class WuSuBeer implements Goods {
    @Override
    public String getName() {
        return "夺命大乌苏";
    }

    @Override
    public float getPrice() {
        return 8;
    }
}
