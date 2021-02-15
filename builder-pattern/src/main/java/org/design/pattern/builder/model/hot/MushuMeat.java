package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 木须肉
 */
public class MushuMeat implements Goods {
    @Override
    public String getName() {
        return "木须肉";
    }

    @Override
    public float getPrice() {
        return 29;
    }
}
