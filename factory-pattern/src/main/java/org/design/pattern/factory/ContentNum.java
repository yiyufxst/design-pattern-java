package org.design.pattern.factory;

import lombok.Getter;

/**
 * 内容枚举类
 */
@Getter
public enum ContentNum {

    ARTICLE("article"),
    VIDEO("video"),
    LIVE("live");


    ContentNum(String type) {
        this.type = type;
    }

    /**
     * 内容类型
     */
    private String type;
}
