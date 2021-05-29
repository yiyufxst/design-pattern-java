package org.design.pattern.observer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 快递
 */
@Getter
@Setter
@AllArgsConstructor
public class Express {

    /**
     * 快递id
     */
    private String id;

    /**
     * 收件人名称
     */
    private String recipientName;

    /**
     * 收件人打电话
     */
    private String recipientPhone;

    /**
     * 收件人地址
     */
    private String recipientAddress;
}
