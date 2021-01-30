package org.design.pattern.factory.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 文章
 */
@Getter
@Setter
public class Article extends ContentBase {
    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 文章分区id
     */
    private int partitionId;

    /**
     * 文章分类
     */
    private String articleType;

    /**
     * 文章所属话题列表
     */
    private List<String> topics;
}
