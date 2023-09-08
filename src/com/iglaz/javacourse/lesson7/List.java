package com.iglaz.javacourse.lesson7;

public class List<T> {
    private final T[] elements;
    private int size;

    public List(int startValue) {
        this.elements = (T[]) new Object[startValue];
    }

    public void add(T element) {
        elements[size] = element;
        size++;
    }

    public T get(int number) throws InterruptedException {
        return elements[number];
    }

    public int getSize() {
        return size;
    }
}
