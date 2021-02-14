package org.design.pattern.abstract_factory.model.shoes;

/**
 * 现代风鞋子
 */
public class ModernShoes implements Shoes {
    @Override
    public void getStyle() {
        System.out.println("现代风皮鞋");
    }
}
