package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 地锅鸡
 */
public class LocalPotChicken implements Goods {
    @Override
    public String getName() {
        return "地锅鸡";
    }

    @Override
    public float getPrice() {
        return 40;
    }
}
