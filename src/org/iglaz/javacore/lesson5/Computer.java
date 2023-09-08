package org.iglaz.javacore.lesson5;

public class Computer {

    private int ssd = BASE_VALUE;
    Ram ram;
    int ves;
    ProcessorType processorType;
    static int counter = 0;

    public Computer(ProcessorType processorType) {
        this.processorType = processorType;
    }

    private static final int BASE_VALUE = 250;

    public Computer(int newSsd, Ram ram) {
        ssd = newSsd;
        System.out.println("Comuter constr");
        System.out.println("Первый конструкто");
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

    final void  load() {
        System.out.println("Load Computer");
    }

    public void printState() {
        System.out.println("Ram" + ram.value);
    }
}


