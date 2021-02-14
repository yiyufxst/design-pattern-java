package org.design.pattern.abstract_factory.model.coat;

/**
 * 复古风上衣
 */
public class RetroCoat implements Coat {
    @Override
    public void getStyle() {
        System.out.println("复古风大衣");
    }
}
