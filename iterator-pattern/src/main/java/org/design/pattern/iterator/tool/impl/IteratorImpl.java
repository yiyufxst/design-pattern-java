package org.design.pattern.iterator.tool.impl;

import org.design.pattern.iterator.tool.Iterator;

/**
 * 迭代器实现类
 *
 * @param <E>
 */
public class IteratorImpl<E> implements Iterator<E> {

    private final CollectionImpl<E> groupCollection;

    private int currentIndex;

    public IteratorImpl(CollectionImpl<E>  groupCollection) {
        this.currentIndex = 0;
        this.groupCollection = groupCollection;
    }

    /**
     * 是否有下一个节点
     *
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return currentIndex < groupCollection.size();
    }

    /**
     * 获取下一个节点
     *
     * @return E
     */
    @Override
    public E getNext() {
        if (!hasNext()) {
            return null;
        }
        E e = groupCollection.get(currentIndex);
        currentIndex++;
        return e;
    }
}
