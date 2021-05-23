package org.design.pattern.memento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 发布记录
 */
@Getter
@Setter
@AllArgsConstructor
public class ReleaseRecord {

    /**
     * 发布记录号
     */
    private Integer id;

    /**
     * 发布版本
     */
    private String version;

    /**
     * 发布容器
     */
    private String cloudName;

    /**
     * 开发
     */
    private String developerName;

    /**
     * 测试
     */
    private String testerName;
}
