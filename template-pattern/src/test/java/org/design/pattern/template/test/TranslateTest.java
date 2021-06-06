package org.design.pattern.template.test;

import org.design.pattern.template.service.TranslateService;
import org.design.pattern.template.service.impl.BaiDuTranslateServiceImpl;
import org.design.pattern.template.service.impl.GoogleTranslateServiceImpl;
import org.design.pattern.template.service.impl.YouDaoTranslateServiceImpl;
import org.junit.Test;

/**
 * 翻译测试类
 */
public class TranslateTest {

    @Test
    public void test() {
        // 百度翻译
        TranslateService baiduTranslate = new BaiDuTranslateServiceImpl();
        baiduTranslate.provideTranslate();
        // 谷歌翻译
        TranslateService googleTranslate = new GoogleTranslateServiceImpl();
        googleTranslate.provideTranslate();
        // 有道翻译
        TranslateService youDaoTranslate = new YouDaoTranslateServiceImpl();
        youDaoTranslate.provideTranslate();
    }
}
