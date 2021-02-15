package org.design.pattern.builder.model.drink;

import org.design.pattern.builder.model.Goods;

public class LaoShanBeer implements Goods {
    @Override
    public String getName() {
        return "崂山啤酒";
    }

    @Override
    public float getPrice() {
        return 4;
    }
}
