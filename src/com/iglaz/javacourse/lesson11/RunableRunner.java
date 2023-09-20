package com.iglaz.javacourse.lesson11;

public class RunableRunner {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}
