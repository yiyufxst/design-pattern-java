package org.design.pattern.composite.model.decision.impl;

import org.design.pattern.composite.model.decision.LogicBaseDecision;

import java.util.Map;

/**
 * 用户性别决策器
 */
public class UserGenderDecision extends LogicBaseDecision {
    @Override
    public String getDecisionValue(Long treeId, String userId, Map<String, String> userData) {
        return userData.get("gender");
    }
}
