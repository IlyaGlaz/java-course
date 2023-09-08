package com.iglaz.javacourse.lesson7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListRunner {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(2, "Ivan", "Sidorov");
        Person person3 = new Person(3, "Ivan", "Petrov");

        Map<Person, String> map = new TreeMap<>(new PersonComparator());
        map.put(person2, "Ivan");
        map.put(person3, "Ivan");
        map.put(person1, "Ivan");
        Set<Person> people = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<Person, String>> entries = map.entrySet();
    }
}
