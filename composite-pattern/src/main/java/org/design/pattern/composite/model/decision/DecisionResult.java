package org.design.pattern.composite.model.decision;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 决策结果
 */
@Getter
@Setter
@AllArgsConstructor
public class DecisionResult {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 决策树id
     */
    private Long treeId;

    /**
     * 结果节点值
     */
    private Object resultNodeValue;
}
