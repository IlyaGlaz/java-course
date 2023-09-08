package org.iglaz.javacore.lesson6;

import org.iglaz.javacore.lesson6.weapons.Bow;
import org.iglaz.javacore.lesson6.weapons.RangeWeapon;
import org.iglaz.javacore.lesson6.weapons.Sword;
import org.iglaz.javacore.lesson6.weapons.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<RangeWeapon> archer = new Archer<>("Legolas", 22);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Konan", 45);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
