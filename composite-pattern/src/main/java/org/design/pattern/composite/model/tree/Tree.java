package org.design.pattern.composite.model.tree;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;


/**
 * 决策树
 */
@Getter
@Setter
public class Tree {
    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 根节点
     */
    private TreeNode treeRootNode;

    /**
     * 节点列表
     */
    private Map<Long, TreeNode> treeNodeMap;
}
