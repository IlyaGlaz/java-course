package org.iglaz.javacore.lesson5;

public class ComputerRunner {

    public static void main(String... args) {

        Laptop laptop = new Laptop(22, 12);
        Laptop laptop2 = new Laptop(22, 12);
        Laptop laptop3 = new Laptop(22, 12);
        Laptop laptop4 = new Laptop(22, 12);
        Laptop laptop5 = new Laptop(22, 12);

        laptop.close();
        laptop2.close();
        laptop3.close();
        laptop4.close();
        laptop5.close();

        ProcessorType bit32 = ProcessorType.BIT_32;
        new Computer(bit32).load();
        bit32.someDeal();
        System.out.println(bit32.ordinal());
        System.out.println(bit32);
        int length = ProcessorType.values().length;
    }
}