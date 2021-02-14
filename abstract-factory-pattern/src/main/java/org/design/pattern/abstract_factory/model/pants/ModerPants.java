package org.design.pattern.abstract_factory.model.pants;

/**
 * 现代风裤子
 */
public class ModerPants implements Pants {
    @Override
    public void getStyle() {
        System.out.println("现代风西裤");
    }
}
