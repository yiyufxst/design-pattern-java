package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 农家小炒肉
 */
public class FarmhouseFriedPork implements Goods {
    @Override
    public String getName() {
        return "农家小炒肉";
    }

    @Override
    public float getPrice() {
        return 25;
    }
}
