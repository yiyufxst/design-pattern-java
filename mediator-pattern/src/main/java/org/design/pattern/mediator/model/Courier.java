package org.design.pattern.mediator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 快递员
 */
@Slf4j
@Getter
@Setter
@AllArgsConstructor
public class Courier {

    /**
     * 快递员id
     */
    private String id;

    /**
     * 快递员姓名
     */
    private String name;

    /***
     * 送快递（放到快递站）
     *
     * @param expressPackage 快递包裹
     */
    public void sendExpressPackage(ExpressPackage expressPackage) {
        expressPackage.getReceiveCourierStation().receiveExpressPackage(expressPackage);
    }

    /**
     * 收快递（从快递站取件，并发货）
     *
     * @param expressPackage 快递包裹
     */
    public void receiveExpressPackage(ExpressPackage expressPackage) {
        log.info(
            "The courier {} has arrived in the hands of the express package {}, and it will be sent to you immediately.",
            this.getName(),
            expressPackage.getName()
        );
    }
}
