package org.design.pattern.iterator.tool;

/**
 * 集合接口
 * @param <E>
 */
public interface Collection<E> {

    /**
     * 创建迭代器
     *
     * @return Iterator<E>
     */
    Iterator<E> createIterator();

    /**
     * 添加集合元素
     *
     * @param e 集合元素
     * @return boolean
     */
    boolean add(E e);

    /**
     * 删除集合元素
     *
     * @param e 集合元素
     * @return boolean
     */
    boolean remove(E e);

    /**
     * 获取集合长度
     *
     * @return Integer
     */
    Integer size();

    /**
     * 获取集合元素
     *
     * @param index 索引
     * @return E
     */
    E get(Integer index);
}
