package com.iglaz.javacourse.lesson10;

import java.util.List;
import java.util.Optional;

public class StreamRunner {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        Optional<Integer> reduce = menu.stream()
                .distinct()
                .filter(Dish::isVegetarian)
                .map(Dish::getCalories)
                .reduce((d1, d2) -> d1 + d2);

        System.out.println(reduce.get());
    }
}
