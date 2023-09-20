package com.iglaz.javacourse.lesson10;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;


        long start = System.currentTimeMillis();
        long sum = LongStream.rangeClosed(1, 100_000_000L)
                .sum();

        System.out.println(sum);

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);
    }
}
