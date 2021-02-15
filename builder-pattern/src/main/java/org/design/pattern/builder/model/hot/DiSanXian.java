package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 地三鲜
 */
public class DiSanXian implements Goods {
    @Override
    public String getName() {
        return "地三鲜";
    }

    @Override
    public float getPrice() {
        return 18;
    }
}
