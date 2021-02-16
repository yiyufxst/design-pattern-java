package org.design.pattern.prototype.test;

import org.design.pattern.prototype.model.WuKong;
import org.junit.Test;

public class WuKongTest {
    @Test
    public void testWuKong() {
        //齐天大圣孙悟空
        WuKong wuKong = new WuKong();
        wuKong.setHealthPoint(540);
        wuKong.setMagicPoint(300);
        wuKong.setAttackDamage(68);
        wuKong.setAbilityPower(54);
        //复制孙悟空分身
        wuKong.setAttackDamageProportion(0.3f);
        WuKong fakeKong = wuKong.clone();
        System.out.println("孙悟空攻击：");
        wuKong.attach();
        System.out.println("孙悟空分身攻击：");
        fakeKong.attach();
    }
}
