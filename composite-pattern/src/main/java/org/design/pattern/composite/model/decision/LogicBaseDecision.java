package org.design.pattern.composite.model.decision;

import org.design.pattern.composite.model.tree.TreeNodeDecision;

import java.util.List;
import java.util.Map;

/**
 * 逻辑基础决策器
 */
public abstract class LogicBaseDecision implements LogicDecision {
    @Override
    public abstract String getDecisionValue(Long treeId, String userId, Map<String, String> userData);;

    @Override
    public Long filterDecisionNode(String decisionValue, List<TreeNodeDecision> treeNodeDecisionList) {
        for (TreeNodeDecision treeNodeDecision : treeNodeDecisionList) {
            if (filterDecisionByType(decisionValue, treeNodeDecision)) {
                return treeNodeDecision.getToNode();
            }
        }
        return 0L;
    }

    /**
     * 根据类型过滤决策
     * @param decisionValue 决策值
     * @param treeNodeDecision 节点决策
     * @return boolean
     */
    private boolean filterDecisionByType(String decisionValue, TreeNodeDecision treeNodeDecision) {
        switch (treeNodeDecision.getDecisionType()) {
            case "eq":
                return decisionValue.equals(treeNodeDecision.getDecisionValue());
            case "gt":
                return Double.parseDouble(decisionValue) > Double.parseDouble(treeNodeDecision.getDecisionValue());
            case "gte":
                return Double.parseDouble(decisionValue) >= Double.parseDouble(treeNodeDecision.getDecisionValue());
            case "lt":
                return Double.parseDouble(decisionValue) < Double.parseDouble(treeNodeDecision.getDecisionValue());
            case "lte":
                return Double.parseDouble(decisionValue) <= Double.parseDouble(treeNodeDecision.getDecisionValue());
            default:
                return false;
        }
    }
}
