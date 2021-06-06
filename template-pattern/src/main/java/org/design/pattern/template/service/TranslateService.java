package org.design.pattern.template.service;

/**
 * 翻译服务
 */
public abstract class TranslateService {

    /**
     * 抓取翻译页面
     */
    public abstract void crawlTranslatePage();

    /**
     * 渲染翻译页面iframe
     */
    public abstract void renderTranslateIframe();

    /**
     * 提供翻译
     */
    public void provideTranslate() {
        crawlTranslatePage();
        renderTranslateIframe();
    }
}
