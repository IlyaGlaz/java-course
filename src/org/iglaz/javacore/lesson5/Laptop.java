package org.iglaz.javacore.lesson5;

public final class Laptop extends Computer {

    public Laptop(int newSsd, int newRam) {
        super(newSsd, null);
        System.out.println("Laptop constr");
    }

    void close() {
        System.out.println("Я отекрылся");
    }
}
