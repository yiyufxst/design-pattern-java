package org.design.pattern.abstract_factory.service;

import org.design.pattern.abstract_factory.factory.SuitFactory;
import org.design.pattern.abstract_factory.model.coat.Coat;
import org.design.pattern.abstract_factory.model.hat.Hat;
import org.design.pattern.abstract_factory.model.pants.Pants;
import org.design.pattern.abstract_factory.model.shoes.Shoes;

/**
 * 厘米秀服务实现类
 */
public class CmShowServiceImpl implements CmShowService {
    private Hat hat;

    private Coat coat;

    private Pants pants;

    private Shoes shoes;

    public CmShowServiceImpl(SuitFactory suitFactory) {
        this.hat = suitFactory.createHat();
        this.coat = suitFactory.createCoat();
        this.pants = suitFactory.createPants();
        this.shoes = suitFactory.createShoes();
    }

    @Override
    public void getSuitStyle() {
        this.hat.getStyle();
        this.coat.getStyle();
        this.pants.getStyle();
        this.shoes.getStyle();
    }
}
