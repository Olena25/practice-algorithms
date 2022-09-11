package com.intellias.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PersonsUtils {
    public static List<Person> createPersons(long size) {
        List<Person> persons = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            int height = ThreadLocalRandom.current().nextInt(120, 200);
            int weight = ThreadLocalRandom.current().nextInt(40, 120);
            int age = ThreadLocalRandom.current().nextInt(18, 100);
            Person person = new Person(height, weight, age);
            persons.add(person);
        }
        return persons;
    }
}
