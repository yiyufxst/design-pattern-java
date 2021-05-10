package org.design.pattern.iterator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * QQ好友
 */
@Getter
@Setter
@AllArgsConstructor
public class Friend {

    /**
     * 用户id
     */
    private String id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 备注
     */
    private String noteName;
}
