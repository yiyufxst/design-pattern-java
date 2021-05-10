package org.design.pattern.iterator.tool;

/**
 * 迭代器接口
 *
 * @param <T>
 */
public interface Iterator<T> {

    /**
     * 是否有下一个节点
     *
     * @return boolean
     */
    boolean hasNext();

    /**
     * 获取下一个节点
     *
     * @return T
     */
    T getNext();
}
