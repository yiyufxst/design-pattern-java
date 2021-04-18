package org.design.pattern.chain;

import org.apache.commons.lang3.ObjectUtils;

/**
 * 中间件抽象类
 */
public abstract class Middleware {

    /**
     * 下一个节点
     */
    private Middleware next;

    /**
     * 设置下一个中间件节点
     *
     * @param next 下一个中间件节点
     * @return Middleware
     */
    public Middleware setNext(Middleware next) {
        this.next = next;
        return this;
    }

    /**
     * 验证
     *
     * @param userId 用户id
     * @param email 邮箱
     * @return boolean
     */
    public boolean auth(String userId, String email) {
        if (ObjectUtils.isEmpty(next)) {
            return true;
        }
        return next.auth(userId, email);
    }
}
