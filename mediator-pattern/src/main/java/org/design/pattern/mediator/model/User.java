package org.design.pattern.mediator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 */
@Getter
@Setter
@AllArgsConstructor
public class User {

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 寄快递（快递放到快递站）
     *
     * @param expressPackage 快递包裹
     */
    public void sendExpressPackage(ExpressPackage expressPackage) {
        expressPackage.getSendCourierStation().sendExpressPackage(expressPackage);
    }
}
