package org.design.pattern.abstract_factory.model.hat;

/**
 * 现代风帽子
 */
public class ModernHat implements Hat {
    @Override
    public void getStyle() {
        System.out.println("现代风礼帽");
    }
}
