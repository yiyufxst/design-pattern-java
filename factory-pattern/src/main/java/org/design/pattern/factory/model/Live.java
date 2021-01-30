package org.design.pattern.factory.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 直播
 */
@Getter
@Setter
public class Live extends ContentBase {
    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 直播间id
     */
    private String roomId;

    /**
     * 直播封面图片地址
     */
    private String coverUrl;

    /**
     * 直播分区id
     */
    private String partitionId;
}
