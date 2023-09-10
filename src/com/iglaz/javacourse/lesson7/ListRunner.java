package com.iglaz.javacourse.lesson7;

import java.util.HashMap;
import java.util.Map;

public class ListRunner {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(2, "Ivan", "Sidorov");
        Person person3 = new Person(3, "Ivan", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(person2.getId(), person2);
        map.put(person3.getId(), person3);
        map.put(person1.getId(), person1);
    }
}
