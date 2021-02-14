package org.design.pattern.abstract_factory.test;

import org.design.pattern.abstract_factory.factory.ModernSuitFactory;
import org.design.pattern.abstract_factory.factory.RetroSuitFactory;
import org.design.pattern.abstract_factory.factory.SuitFactory;
import org.design.pattern.abstract_factory.service.CmShowService;
import org.design.pattern.abstract_factory.service.CmShowServiceImpl;
import org.junit.Test;

public class CmShowServiceTest {
    @Test
    public void getModernSuitCmShow() {
        System.out.println("现代风厘米秀：");
        SuitFactory suitFactory = new ModernSuitFactory();
        CmShowService cmShowService = new CmShowServiceImpl(suitFactory);
        cmShowService.getSuitStyle();
    }

    @Test
    public void getRetroSuitCmShow() {
        System.out.println("复古风厘米秀：");
        SuitFactory suitFactory = new RetroSuitFactory();
        CmShowService cmShowService = new CmShowServiceImpl(suitFactory);
        cmShowService.getSuitStyle();
    }
}
