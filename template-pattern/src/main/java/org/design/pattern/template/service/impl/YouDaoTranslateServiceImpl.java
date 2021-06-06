package org.design.pattern.template.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.template.service.TranslateService;

/**
 * 有道翻译服务实现类
 */
@Slf4j
public class YouDaoTranslateServiceImpl extends TranslateService {

    /**
     * 抓取翻译页面
     */
    @Override
    public void crawlTranslatePage() {
        log.info("抓取有道翻译页面");
    }

    /**
     * 渲染翻译页面iframe
     */
    @Override
    public void renderTranslateIframe() {
        log.info("适配并渲染有道翻译页面");
    }
}
