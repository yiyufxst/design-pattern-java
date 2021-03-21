package org.design.pattern.composite.service;

import org.design.pattern.composite.model.decision.DecisionResult;
import org.design.pattern.composite.model.tree.Tree;

import java.util.Map;

/**
 * 决策树服务接口
 */
public interface DecisionTreeService {
    DecisionResult process(final Tree treeId, final String userId, final Map<String, String> userData);
}
