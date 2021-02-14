package org.design.pattern.abstract_factory.model.hat;

/**
 * 复古风帽子
 */
public class RetroHat implements Hat {
    @Override
    public void getStyle() {
        System.out.println("复古风礼帽");
    }
}
