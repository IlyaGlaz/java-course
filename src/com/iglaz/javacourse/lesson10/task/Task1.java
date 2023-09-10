package com.iglaz.javacourse.lesson10.task;

import com.iglaz.javacourse.lesson10.Dish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Какой из потоковых операций вы бы воспользовались для рефакторинга следующего кода?
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> highCaloricDishes = new ArrayList<>();
        Iterator<Dish> iterator = Dish.menu.iterator();
        while (iterator.hasNext()) {
            Dish dish = iterator.next();
            if (dish.getCalories() > 300) {
                highCaloricDishes.add(dish.getName());
            }
        }
    }
}
