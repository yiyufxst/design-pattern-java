package org.design.pattern.builder.model.hot;

import org.design.pattern.builder.model.Goods;

/**
 * 宫保鸡丁
 */
public class KungPaoChicken implements Goods {
    @Override
    public String getName() {
        return "宫保鸡丁";
    }

    @Override
    public float getPrice() {
        return 32;
    }
}
