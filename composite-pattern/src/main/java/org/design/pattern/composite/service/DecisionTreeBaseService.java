package org.design.pattern.composite.service;

import org.design.pattern.composite.model.decision.DecisionResult;
import org.design.pattern.composite.model.decision.LogicDecision;
import org.design.pattern.composite.model.tree.Tree;
import org.design.pattern.composite.model.tree.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 决策树基础服务
 */
public abstract class DecisionTreeBaseService implements DecisionTreeService {
    private final Logger log = LoggerFactory.getLogger(DecisionTreeBaseService.class);

    /**
     * 决策map
     */
    protected Map<String, LogicDecision> logicDecisionMap = new ConcurrentHashMap<>();

    @Override
    public abstract DecisionResult process(Tree tree, String userId, Map<String, String> userData);

    /**
     * 寻找叶子节点
     * @param tree 决策树
     * @param userId 用户id
     * @param userData 用户数据
     * @return
     */
    protected TreeNode findLeafNode(Tree tree, String userId, Map<String, String> userData) {
        TreeNode treeNode = tree.getTreeRootNode();
        while (treeNode.getNodeType().equals("branch")) {
            //获取节点决策
            LogicDecision logicDecision = logicDecisionMap.get(treeNode.getDecisionName());
            //获取需要决策的值
            String decisionValue = logicDecision.getDecisionValue(tree.getId(), userId, userData);
            //根据节点决策列表，获取下一节点id
            Long nextNodeId = logicDecision.filterDecisionNode(decisionValue, treeNode.getTreeNodeDecisionList());
            log.info(
                    "决策树：{}，用户id：{}，当前节点id：{}，下一节点id：{}，决策名：{}，决策值：{}",
                    tree.getId(),
                    userId,
                    treeNode.getNodeId(),
                    nextNodeId,
                    treeNode.getDecisionName(),
                    decisionValue
            );
            treeNode = tree.getTreeNodeMap().get(nextNodeId);
        }
        return treeNode;
    }
}
