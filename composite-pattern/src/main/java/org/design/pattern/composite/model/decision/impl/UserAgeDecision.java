package org.design.pattern.composite.model.decision.impl;

import org.design.pattern.composite.model.decision.LogicBaseDecision;

import java.util.Map;

/**
 * 用户年龄决策器
 */
public class UserAgeDecision extends LogicBaseDecision {
    @Override
    public String getDecisionValue(Long treeId, String userId, Map<String, String> userData) {
        return userData.get("age");
    }
}
