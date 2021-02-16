package org.design.pattern.prototype.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 英雄基类
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class Hero {
    /**
     * 生命值
     */
    protected int healthPoint;

    /**
     * 法力值
     */
    protected int magicPoint;

    /**
     * 物理伤害
     */
    protected int attackDamage;

    /**
     * 法术伤害
     */
    protected int abilityPower;

    public Hero(Hero hero) {
        if (hero != null) {
            this.healthPoint = hero.healthPoint;
            this.magicPoint = hero.magicPoint;
            this.attackDamage = hero.attackDamage;
            this.abilityPower = hero.abilityPower;
        }
    }

    public abstract Hero clone();

    /**
     * 攻击
     */
    public void attach() {
        System.out.printf("This hero’s attack caused %d damage", this.attackDamage);
        System.out.println();
    }
}
