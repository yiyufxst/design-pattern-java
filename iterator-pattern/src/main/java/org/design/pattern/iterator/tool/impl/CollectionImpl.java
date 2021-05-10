package org.design.pattern.iterator.tool.impl;

import org.design.pattern.iterator.tool.Collection;
import org.design.pattern.iterator.tool.Iterator;
import java.util.ArrayList;
import java.util.List;

/**
 * 集合实现类
 *
 * @param <E>
 */
public class CollectionImpl<E> implements Collection<E> {

    private final List<E> groupList;

    public CollectionImpl() {
        this.groupList = new ArrayList<>();
    }

    /**
     * 创建迭代器
     *
     * @return Iterator<E>
     */
    @Override
    public Iterator<E> createIterator() {
        return new IteratorImpl<E>(this);
    }

    /**
     * 添加集合元素
     *
     * @param e 集合元素
     * @return boolean
     */
    @Override
    public boolean add(E e) {
        return groupList.add(e);
    }

    /**
     * 删除集合元素
     *
     * @param e 集合元素
     * @return boolean
     */
    @Override
    public boolean remove(E e) {
        return groupList.remove(e);
    }

    /**
     * 获取集合长度
     *
     * @return Integer
     */
    @Override
    public Integer size() {
        return groupList.size();
    }

    /**
     * 获取集合元素
     *
     * @param index 索引
     * @return E
     */
    @Override
    public E get(Integer index) {
        return groupList.get(index);
    }
}
