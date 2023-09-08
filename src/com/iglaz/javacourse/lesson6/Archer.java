package com.iglaz.javacourse.lesson6;

import com.iglaz.javacourse.lesson6.weapons.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {
    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
