package org.design.pattern.composite.model.tree;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 决策树节点
 */
@Setter
@Getter
public class TreeNode {
    /**
     * 节点id
     */
    private Long nodeId;

    /**
     * 节点类型
     */
    private String NodeType;

    /**
     * 节点值
     */
    private Object NodeValue;

    /**
     * 来源节点id
     */
    private Long fromNodeId;

    /**
     * 去向节点id
     */
    private Long toNodeId;

    /**
     * 决策名
     */
    private String decisionName;

    /**
     * 决策规则列表
     */
    private List<TreeNodeDecision> treeNodeDecisionList;
}
