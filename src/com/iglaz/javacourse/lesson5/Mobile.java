package com.iglaz.javacourse.lesson5;

public class Mobile extends Laptop {
    public Mobile(int newSsd, int newRam) {
        super(newSsd, newRam);
        System.out.println("Mobile constr");
    }

    public void call() {
        System.out.println("Динь-динь");
    }
}
