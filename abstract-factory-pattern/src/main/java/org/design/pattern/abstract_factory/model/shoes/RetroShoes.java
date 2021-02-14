package org.design.pattern.abstract_factory.model.shoes;

/**
 * 复古风鞋子
 */
public class RetroShoes implements Shoes {
    @Override
    public void getStyle() {
        System.out.println("复古风长靴");
    }
}
