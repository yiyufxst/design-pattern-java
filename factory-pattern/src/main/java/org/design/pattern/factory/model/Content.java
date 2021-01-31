package org.design.pattern.factory.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 内容基类
 */
@Getter
@Setter
public class Content {
    /**
     * 内容id
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;
}
