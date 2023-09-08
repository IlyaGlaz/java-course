package org.iglaz.javacore.lesson5;

public enum ProcessorType implements Printable {
    BIT_64(64),
    BIT_32(32);

    int value;

    ProcessorType(int value) {
        this.value = value;
    }

    @Override
    public void someDeal() {
        System.out.println("sdfasf");
    }
}
