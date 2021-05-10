package org.design.pattern.iterator.test;

import org.design.pattern.iterator.model.Friend;
import org.design.pattern.iterator.model.Group;
import org.design.pattern.iterator.tool.Iterator;
import org.design.pattern.iterator.tool.impl.CollectionImpl;
import org.junit.Test;

/**
 * 迭代器测试
 */
public class IteratorTest {

    @Test
    public void testIterator() {
        CollectionImpl<Friend> friendCollectionOne = new CollectionImpl<>();
        friendCollectionOne.add(new Friend("1", "小可乐", "王明"));
        friendCollectionOne.add(new Friend("2", "阿毛今天睡醒了", "三毛"));
        friendCollectionOne.add(new Friend("3", "楚语吴歌", "夏亚"));

        CollectionImpl<Friend> friendCollectionTwo = new CollectionImpl<>();
        friendCollectionTwo.add(new Friend("1", "系鞋带进修员 ", "张涛"));

        CollectionImpl<Friend> friendCollectionThree = new CollectionImpl<>();
        friendCollectionThree.add(new Friend("1", "饕餮少女 ", "王霖"));

        CollectionImpl<Group> groupCollection = new CollectionImpl<>();
        groupCollection.add(new Group("1", "同学", friendCollectionOne));
        groupCollection.add(new Group("2", "网友", friendCollectionTwo));
        groupCollection.add(new Group("3", "同事", friendCollectionThree));

        Iterator<Group> groupIterator = groupCollection.createIterator();
        while (groupIterator.hasNext()) {
            Group group = groupIterator.getNext();
            System.out.printf("group id is %s, group name is %s", group.getId(), group.getName());
            System.out.println();
            Iterator<Friend> friendIterator = group.getFriendList().createIterator();
            while (friendIterator.hasNext()) {
                Friend friend = friendIterator.getNext();
                System.out.printf(
                        "Friend nickname is %s, Friend noteName is %s",
                        friend.getNickname(),
                        friend.getNoteName()
                );
                System.out.println();
            }
            System.out.println();
        }
    }
}
