package com.iglaz.javacourse.lesson10.task;

import com.iglaz.javacourse.lesson10.Dish;

import java.util.Arrays;

/**
 * Как бы вы отфильтровали два первых мясных блюда с помощью потоков данных?
 */
public class Task2 {
    public static void main(String[] args) {
        Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 400, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
    }
}
