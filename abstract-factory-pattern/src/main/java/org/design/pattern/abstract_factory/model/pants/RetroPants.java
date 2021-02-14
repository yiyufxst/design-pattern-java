package org.design.pattern.abstract_factory.model.pants;

/**
 * 复古风裤子
 */
public class RetroPants implements Pants {
    @Override
    public void getStyle() {
        System.out.println("复古风长裤");
    }
}
