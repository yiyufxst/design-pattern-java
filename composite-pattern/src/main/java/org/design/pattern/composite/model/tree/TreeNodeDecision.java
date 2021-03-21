package org.design.pattern.composite.model.tree;

import lombok.Getter;
import lombok.Setter;

/**
 * 决策树节点决策
 */
@Getter
@Setter
public class TreeNodeDecision {
    /**
     * 决策名称
     */
    private String name;

    /**
     * 来源节点
     */
    private Long fromNode;

    /**
     * 去向节点
     */
    private Long toNode;

    /**
     * 决策类型
     */
    private String decisionType;

    /**
     * 决策值
     */
    private String decisionValue;
}
