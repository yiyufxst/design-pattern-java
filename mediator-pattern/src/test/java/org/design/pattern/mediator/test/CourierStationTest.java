package org.design.pattern.mediator.test;

import org.design.pattern.mediator.model.Courier;
import org.design.pattern.mediator.model.ExpressPackage;
import org.design.pattern.mediator.model.User;
import org.design.pattern.mediator.service.impl.CaiNiaoCourierStation;
import org.junit.Test;
import java.util.Collections;

/**
 * 快递站测试类
 */
public class CourierStationTest {

    @Test
    public void testReceiveExpressPackage() {
        Courier courier = new Courier("1", "快递小哥");
        CaiNiaoCourierStation courierStation = new CaiNiaoCourierStation();
        courierStation.setCourierList(Collections.singletonList(courier));
        ExpressPackage expressPackage = new ExpressPackage(
                "1", "PS5", "13245678910", null, courierStation
        );
        courier.sendExpressPackage(expressPackage);
    }

    @Test
    public void testSendExpressPackage() {
        User user = new User("1", "张三", "13245678910");
        Courier courier = new Courier("1", "快递小哥");
        CaiNiaoCourierStation courierStation = new CaiNiaoCourierStation();
        courierStation.setCourierList(Collections.singletonList(courier));
        ExpressPackage expressPackage = new ExpressPackage(
                "1", "Kindle", "13245678910", courierStation, null
        );
        user.sendExpressPackage(expressPackage);
    }
}
