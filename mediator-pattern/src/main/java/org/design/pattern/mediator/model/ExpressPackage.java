package org.design.pattern.mediator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.design.pattern.mediator.service.CourierStation;

/**
 * 快递包裹
 */
@Getter
@Setter
@AllArgsConstructor
public class ExpressPackage {

    /**
     * 包裹id
     */
    private String id;

    /**
     * 包裹名称
     */
    private String name;

    /**
     * 收件人电话
     */
    private String consigneePhoneNumber;

    /**
     * 发件快递站
     */
    private CourierStation sendCourierStation;

    /**
     * 收件快递站
     */
    private CourierStation receiveCourierStation;
}
