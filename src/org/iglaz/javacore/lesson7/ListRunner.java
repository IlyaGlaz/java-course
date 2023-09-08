package org.iglaz.javacore.lesson7;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ListRunner {

    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(2, "Ivan", "Sidorov");
        Person person3 = new Person(3, "Ivan", "Petrov");

        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(person1);

//
//        System.out.println(person.hashCode());
//        System.out.println(person1.hashCode());
//
        Map<Person, String> map = new TreeMap<>(new PersonComparator());
        map.put(person2, "Ivan");
        map.put(person3, "Ivan");
        map.put(person1, "Ivan");
        Set<Person> people = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<Person, String>> entries = map.entrySet();



//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        int number = 22;

//        List<Person> persons = new ArrayList<>();
//        persons.add(perso1);
//        persons.add(person2);
//        persons.add(person3);

//        List<String> sString = new ArrayList<>();
//        sString.add("hello");
//        sString.add("hello");
//        sString.add("1");
//        sString.add("22");
//        sString.add("hello333");



//        Collections.sort(persons, new PersonComparator());
//        persons.sort(new PersonComparator());
//
//        System.out.println(persons);
    }
}
