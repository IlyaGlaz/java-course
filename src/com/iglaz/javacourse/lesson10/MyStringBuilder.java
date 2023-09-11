package com.iglaz.javacourse.lesson10;

public class MyStringBuilder {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append(i);
        }
        long finish = System.currentTimeMillis();

        System.out.println(finish - start);
    }
}
