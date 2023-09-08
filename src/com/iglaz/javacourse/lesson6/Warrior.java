package com.iglaz.javacourse.lesson6;

import com.iglaz.javacourse.lesson6.weapons.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
