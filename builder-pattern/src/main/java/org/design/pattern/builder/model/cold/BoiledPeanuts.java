package org.design.pattern.builder.model.cold;

import org.design.pattern.builder.model.Goods;

/**
 * 水煮花生
 */
public class BoiledPeanuts implements Goods {
    @Override
    public String getName() {
        return "水煮花生";
    }

    @Override
    public float getPrice() {
        return 8;
    }
}
