package org.design.pattern.factory.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 视频
 */
@Getter
@Setter
public class Video extends ContentBase {
    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 视频地址
     */
    private String videoUrl;

    /**
     * 封面图片地址
     */
    private String coverUrl;

    /**
     * 视频分区
     */
    private String partitionId;
}
