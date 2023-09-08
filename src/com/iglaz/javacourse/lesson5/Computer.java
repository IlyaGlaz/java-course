package com.iglaz.javacourse.lesson5;

public class Computer {
    private static final int BASE_VALUE = 250;
    static int counter = 0;

    private int ssd = BASE_VALUE;
    private Ram ram;
    private int ves;
    private ProcessorType processorType;

    public Computer(ProcessorType processorType) {
        this.processorType = processorType;
    }

    public Computer(int newSsd, Ram ram) {
        ssd = newSsd;
        System.out.println("Comuter constr");
        System.out.println("Первый конструктор");
        counter++;
    }

    public Computer(int ves) {
        this(22, new Ram());
        this.ves = ves;
        System.out.println("Второй");
    }

    public void shutDown() {
        ram.clear();
    }

    final void load() {
        System.out.println("Load Computer");
    }

    public void printState() {
        System.out.println("Ram" + ram.value);
    }
}
