package org.design.pattern.factory.model.content;

import lombok.Getter;
import lombok.Setter;
import org.design.pattern.factory.model.Content;

/**
 * 视频
 */
@Getter
@Setter
public class Video extends Content {
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
