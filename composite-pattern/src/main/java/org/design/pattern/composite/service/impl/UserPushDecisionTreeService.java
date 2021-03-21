package org.design.pattern.composite.service.impl;

import org.design.pattern.composite.model.decision.DecisionResult;
import org.design.pattern.composite.model.decision.impl.UserAgeDecision;
import org.design.pattern.composite.model.decision.impl.UserGenderDecision;
import org.design.pattern.composite.model.tree.Tree;
import org.design.pattern.composite.model.tree.TreeNode;
import org.design.pattern.composite.service.DecisionTreeBaseService;

import java.util.Map;

/**
 * 用户推送决策树服务
 */
public class UserPushDecisionTreeService extends DecisionTreeBaseService {
    public UserPushDecisionTreeService() {
        this.logicDecisionMap.put("gender", new UserGenderDecision());
        this.logicDecisionMap.put("age", new UserAgeDecision());
    }

    @Override
    public DecisionResult process(Tree tree, String userId, Map<String, String> userData) {
        //寻找最终决策节点
        TreeNode resultNode = findLeafNode(tree, userId, userData);
        //决策结果
        return new DecisionResult(userId, tree.getId(), resultNode.getNodeValue());
    }
}
