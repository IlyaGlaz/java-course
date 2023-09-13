package com.iglaz.javacourse.lesson11.atomic;

public class Counter {

    private int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}