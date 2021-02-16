package org.design.pattern.prototype.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 齐天大圣孙悟空
 */
@Getter
@Setter
@NoArgsConstructor
public class WuKong extends Hero {
    /**
     * 物理伤害比例
     */
    protected float attackDamageProportion = 1;

    public WuKong(WuKong wuKong) {
        super(wuKong);
        if (wuKong != null) {
            this.healthPoint = wuKong.healthPoint;
            this.magicPoint = wuKong.magicPoint;
            this.attackDamage =  (int) (wuKong.attackDamage * wuKong.attackDamageProportion);
            this.abilityPower = wuKong.abilityPower;
        }
    }

    @Override
    public WuKong clone() {
        return new WuKong(this);
    }

    /**
     * 攻击
     */
    public void attach() {
        super.attach();
    }
}
