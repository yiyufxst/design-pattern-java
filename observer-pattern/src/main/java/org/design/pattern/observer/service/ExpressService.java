package org.design.pattern.observer.service;

import org.design.pattern.observer.model.Express;

/**
 * 快递服务接口
 */
public interface ExpressService {

    /**
     * 快递已到达
     *
     * @param express 快递
     */
    void arrive(Express express);
}
