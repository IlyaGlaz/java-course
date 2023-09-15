package com.iglaz.javacourse.lesson11;

public class ThreadRunner {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyTread myTread1 = new MyTread();
        MyTread myTread2 = new MyTread();


        myTread1.start();
        myTread2.start();
        new Thread(new MyRunnable()).start();
        new Thread(() -> System.out.println("Hello from lambda " + Thread.currentThread().getName())).start();

        try {
            myTread1.join();
            myTread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main end");
    }
}
