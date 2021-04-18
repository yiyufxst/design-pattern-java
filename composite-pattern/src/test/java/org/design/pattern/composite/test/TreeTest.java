package org.design.pattern.composite.test;

import org.design.pattern.composite.model.decision.DecisionResult;
import org.design.pattern.composite.model.tree.Tree;
import org.design.pattern.composite.model.tree.TreeNode;
import org.design.pattern.composite.model.tree.TreeNodeDecision;
import org.design.pattern.composite.service.impl.UserPushDecisionTreeService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * 决策树测试类
 */
public class TreeTest {
    private final Logger log = LoggerFactory.getLogger(TreeTest.class);

    private Tree tree;

    @Before
    public void initTree() {
        //根节点（性别）
        TreeNode rootNode = new TreeNode();
        rootNode.setNodeId(1L);
        rootNode.setNodeType("branch");

        //根节点的子节点
        //子节点1
        TreeNode rootChildOne = new TreeNode();
        rootChildOne.setNodeId(11L);
        rootChildOne.setNodeType("branch");
        rootChildOne.setFromNodeId(rootNode.getNodeId());
        //子节点2
        TreeNode rootChildTwo = new TreeNode();
        rootChildTwo.setNodeId(12L);
        rootChildTwo.setNodeType("branch");
        rootChildTwo.setFromNodeId(rootNode.getNodeId());

        //孙节点
        //孙节点1
        TreeNode grandChildrenOne = new TreeNode();
        grandChildrenOne.setNodeId(111L);
        grandChildrenOne.setNodeType("leaf");
        grandChildrenOne.setNodeValue("推送二次元类文章");
        grandChildrenOne.setFromNodeId(rootChildOne.getFromNodeId());
        //孙节点2
        TreeNode grandChildrenTwo = new TreeNode();
        grandChildrenTwo.setNodeId(112L);
        grandChildrenTwo.setNodeType("leaf");
        grandChildrenTwo.setNodeValue("推送财经类文章");
        grandChildrenTwo.setFromNodeId(rootChildOne.getFromNodeId());
        //孙节点3
        TreeNode grandChildrenThree = new TreeNode();
        grandChildrenThree.setNodeId(121L);
        grandChildrenThree.setNodeType("leaf");
        grandChildrenThree.setNodeValue("推送A类文章");
        grandChildrenThree.setFromNodeId(rootChildTwo.getFromNodeId());
        //孙节点4
        TreeNode grandChildrenFour = new TreeNode();
        grandChildrenFour.setNodeId(122L);
        grandChildrenFour.setNodeType("leaf");
        grandChildrenFour.setNodeValue("推送B类文章");
        grandChildrenFour.setFromNodeId(rootChildOne.getFromNodeId());

        //根节点决策
        String rootDecisionName = "gender";
        rootNode.setDecisionName(rootDecisionName);
        //性别男
        TreeNodeDecision manDecision = new TreeNodeDecision();
        manDecision.setDecisionType("eq");
        manDecision.setDecisionValue("man");
        manDecision.setFromNode(rootNode.getNodeId());
        manDecision.setToNode(rootChildOne.getNodeId());
        //性别女
        TreeNodeDecision womanDecision = new TreeNodeDecision();
        womanDecision.setDecisionType("eq");
        womanDecision.setDecisionValue("woman");
        womanDecision.setFromNode(rootNode.getNodeId());
        womanDecision.setToNode(rootChildTwo.getNodeId());
        //设置根节点决策
        List<TreeNodeDecision> rootNodeDecisionList = new ArrayList<>(2);
        rootNodeDecisionList.add(manDecision);
        rootNodeDecisionList.add(womanDecision);
        rootNode.setTreeNodeDecisionList(rootNodeDecisionList);

        //子节点决策
        String childDecisionName = "age";
        rootChildOne.setDecisionName(childDecisionName);
        rootChildTwo.setDecisionName(childDecisionName);
        //子节点1决策
        //男，年龄≤24
        TreeNodeDecision ageDecisionOne = new TreeNodeDecision();
        ageDecisionOne.setDecisionType("lte");
        ageDecisionOne.setDecisionValue("24");
        ageDecisionOne.setFromNode(rootChildOne.getNodeId());
        ageDecisionOne.setToNode(grandChildrenOne.getNodeId());
        //男，年龄＞24
        TreeNodeDecision ageDecisionTwo = new TreeNodeDecision();
        ageDecisionTwo.setDecisionType("gt");
        ageDecisionTwo.setDecisionValue("24");
        ageDecisionTwo.setFromNode(rootChildOne.getNodeId());
        ageDecisionTwo.setToNode(grandChildrenTwo.getNodeId());
        //设置子节点1决策
        List<TreeNodeDecision> rootChildOneDecisionList = new ArrayList<>(2);
        rootChildOneDecisionList.add(ageDecisionOne);
        rootChildOneDecisionList.add(ageDecisionTwo);
        rootChildOne.setTreeNodeDecisionList(rootChildOneDecisionList);

        //子节点2决策
        //女，年龄≤35
        TreeNodeDecision ageDecisionThree = new TreeNodeDecision();
        ageDecisionThree.setDecisionType("lte");
        ageDecisionThree.setDecisionValue("35");
        ageDecisionThree.setFromNode(rootChildTwo.getNodeId());
        ageDecisionThree.setToNode(grandChildrenThree.getNodeId());
        //女，年龄＞35
        TreeNodeDecision ageDecisionFour = new TreeNodeDecision();
        ageDecisionFour.setDecisionType("gt");
        ageDecisionFour.setDecisionValue("35");
        ageDecisionFour.setFromNode(rootChildTwo.getNodeId());
        ageDecisionFour.setToNode(grandChildrenFour.getNodeId());
        //设置子节点2决策
        List<TreeNodeDecision> rootChildTwoDecisionList = new ArrayList<>(2);
        rootChildTwoDecisionList.add(ageDecisionThree);
        rootChildTwoDecisionList.add(ageDecisionFour);
        rootChildTwo.setTreeNodeDecisionList(rootChildTwoDecisionList);

        //设置决策树
        tree = new Tree();
        tree.setId(1L);
        tree.setName("精准化运营消息推送决策树");
        //决策树根节点
        tree.setTreeRootNode(rootNode);
        //决策树节点
        Map<Long, TreeNode> treeNodeMap = new TreeMap<>();
        treeNodeMap.put(rootNode.getNodeId(), rootNode);
        treeNodeMap.put(rootChildOne.getNodeId(), rootChildOne);
        treeNodeMap.put(rootChildTwo.getNodeId(), rootChildTwo);
        treeNodeMap.put(grandChildrenOne.getNodeId(), grandChildrenOne);
        treeNodeMap.put(grandChildrenTwo.getNodeId(), grandChildrenTwo);
        treeNodeMap.put(grandChildrenThree.getNodeId(), grandChildrenThree);
        treeNodeMap.put(grandChildrenFour.getNodeId(), grandChildrenFour);
        tree.setTreeNodeMap(treeNodeMap);
    }

    @Test
    public void testUserPushDecisionTree() {
        UserPushDecisionTreeService userPushDecisionTreeService = new UserPushDecisionTreeService();
        //用户数据
        Map<String, String> userData = new HashMap<>();
        userData.put("gender", "man");
        userData.put("age", "29");
        DecisionResult result = userPushDecisionTreeService.process(tree, "yiyufxst", userData);
        log.info("性别:{}，年龄：{}的用户推送{}", userData.get("gender"), userData.get("age"), result.getResultNodeValue());
        userData.put("age", "24");
        result = userPushDecisionTreeService.process(tree, "yiyufxst", userData);
        log.info("性别:{}，年龄：{}的用户推送{}", userData.get("gender"), userData.get("age"), result.getResultNodeValue());
        userData.put("gender", "woman");
        userData.put("age", "35");
        result = userPushDecisionTreeService.process(tree, "马冬梅", userData);
        log.info("性别:{}，年龄：{}的用户推送{}", userData.get("gender"), userData.get("age"), result.getResultNodeValue());
        userData.put("age", "40");
        result = userPushDecisionTreeService.process(tree, "马冬梅", userData);
        log.info("性别:{}，年龄：{}的用户推送{}", userData.get("gender"), userData.get("age"), result.getResultNodeValue());
    }
}
