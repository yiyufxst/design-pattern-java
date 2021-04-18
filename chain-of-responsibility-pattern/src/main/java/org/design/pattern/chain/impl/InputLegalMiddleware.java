package org.design.pattern.chain.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.design.pattern.chain.Middleware;

/**
 * 输入验证中间件
 */
@Slf4j
public class InputLegalMiddleware extends Middleware {

    /**
     * 验证
     *
     * @param userId 用户id
     * @param email 邮箱
     * @return boolean
     */
    @Override
    public boolean auth(String userId, String email) {
        // 模拟验证输入不合法
        if (ObjectUtils.isEmpty(userId) || ObjectUtils.isEmpty(email)) {
            log.error("输入不合法，用户{}，邮箱{}", userId, email);
            return false;
        }

        return super.auth(userId, email);
    }
}
