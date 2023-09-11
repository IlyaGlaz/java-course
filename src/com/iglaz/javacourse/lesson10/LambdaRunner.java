package com.iglaz.javacourse.lesson10;

import java.util.Arrays;
import java.util.List;

public class LambdaRunner {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.sort(Integer::compare);

        System.out.println(integers);
    }
}
