package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 手撕包菜
 */
public class ShreddedCabbage implements Goods {
    @Override
    public String getName() {
        return "手撕包菜";
    }

    @Override
    public float getPrice() {
        return 12;
    }
}
