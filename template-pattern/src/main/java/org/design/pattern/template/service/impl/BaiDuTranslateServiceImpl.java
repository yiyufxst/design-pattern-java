package org.design.pattern.template.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.template.service.TranslateService;

/**
 * 百度翻译服务实现类
 */
@Slf4j
public class BaiDuTranslateServiceImpl extends TranslateService {

    /**
     * 抓取翻译页面
     */
    @Override
    public void crawlTranslatePage() {
        log.info("抓取百度翻译页面");
    }

    /**
     * 渲染翻译页面iframe
     */
    @Override
    public void renderTranslateIframe() {
        log.info("适配并渲染百度翻译页面");
    }
}
