package org.design.pattern.mediator.service.impl;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.design.pattern.mediator.model.Courier;
import org.design.pattern.mediator.model.ExpressPackage;
import java.util.List;
import java.util.Optional;

/**
 * 菜鸟驿站
 */
@Slf4j
@Getter
@Setter
public class CaiNiaoCourierStation implements org.design.pattern.mediator.service.CourierStation {

    /**
     * 快递员列表
     */
    private List<Courier> courierList;

    /**
     * 收件服务
     *
     * @param expressPackage 快递包裹
     */
    @Override
    public void receiveExpressPackage(ExpressPackage expressPackage) {
        log.info(
            "The package {} has arrived at the cai niao courier station, please pick it up as soon as possible.",
            expressPackage.getName()
        );
    }

    /**
     * 寄件服务
     *
     * @param expressPackage 快递包裹
     */
    @Override
    public void sendExpressPackage(ExpressPackage expressPackage) {
      Optional<Courier> courierOptional = courierList.stream().findAny();
      if (courierOptional.isPresent()) {
          Courier courier = courierOptional.get();
          courier.receiveExpressPackage(expressPackage);
      }
    }
}
