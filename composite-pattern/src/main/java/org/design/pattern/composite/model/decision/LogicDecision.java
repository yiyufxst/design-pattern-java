package org.design.pattern.composite.model.decision;

import org.design.pattern.composite.model.tree.TreeNodeDecision;

import java.util.List;
import java.util.Map;

/**
 * 逻辑决策器接口
 */
public interface LogicDecision {
    /**
     * 获取决策值
     * @param treeId 决策树id
     * @param userId 用户id
     * @param userData 用户数据
     * @return String
     */
    String getDecisionValue(Long treeId, String userId, Map<String, String> userData);

    /**
     * 过滤出节点决策
     * @param decisionValue 决策值
     * @param treeNodeDecisionList 节点决策列表
     * @return
     */
    Long filterDecisionNode(String decisionValue, List<TreeNodeDecision> treeNodeDecisionList);
}
