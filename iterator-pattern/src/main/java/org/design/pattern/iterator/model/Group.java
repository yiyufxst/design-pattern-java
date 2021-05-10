package org.design.pattern.iterator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.design.pattern.iterator.tool.impl.CollectionImpl;

/**
 * QQ 分组
 */
@Setter
@Getter
@AllArgsConstructor
public class Group {

    /**
     * 分组id
     */
    private String id;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 好友列表
     */
    private CollectionImpl<Friend> friendList;

    /**
     * 添加好友
     *
     * @param friend 好友
     * @return boolean
     */
    public boolean addFriend(Friend friend) {
        return friendList.add(friend);
    }

    /**
     * 删除好友
     *
     * @param friend 好友
     * @return boolean
     */
    public boolean removeFriend(Friend friend) {
        return friendList.remove(friend);
    }
}
