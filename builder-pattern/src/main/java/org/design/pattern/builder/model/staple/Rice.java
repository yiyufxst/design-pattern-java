package org.design.pattern.builder.model.staple;

import org.design.pattern.builder.model.Goods;

/**
 * 米饭
 */
public class Rice implements Goods {
    @Override
    public String getName() {
        return "米饭";
    }

    @Override
    public float getPrice() {
        return 4;
    }
}
