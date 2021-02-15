package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 土家红烧肉
 */
public class TujiaBraisedPork implements Goods {
    @Override
    public String getName() {
        return "土家红烧肉";
    }

    @Override
    public float getPrice() {
        return 28;
    }
}
