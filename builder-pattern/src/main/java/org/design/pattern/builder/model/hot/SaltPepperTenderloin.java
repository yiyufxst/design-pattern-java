package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 椒盐里脊
 */
public class SaltPepperTenderloin implements Goods {
    @Override
    public String getName() {
        return "椒盐里脊";
    }

    @Override
    public float getPrice() {
        return 32;
    }
}
