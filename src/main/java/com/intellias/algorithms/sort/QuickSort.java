package com.intellias.algorithms.sort;

import com.intellias.algorithms.Person;
import com.intellias.algorithms.PersonsUtils;

import java.util.Comparator;
import java.util.List;

public class QuickSort {
    private static final long PERSONS_SIZE = 100_000;

    public static void main(String[] args) {
        List<Person> persons = PersonsUtils.createPersons(PERSONS_SIZE);
        quickSort(persons, Comparator.comparing(Person::getAge), 0, persons.size() - 1);
        //quickSort(persons, Comparator.comparing(Person::getWeight), 0, persons.size() - 1);
        //quickSort(persons, Comparator.comparing(Person::getHeight), 0, persons.size() - 1);

        persons.forEach(System.out::println);
    }

    public static int getPivot(List<Person> persons, Comparator<Person> personComparator, int begin, int end) {
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (personComparator.compare(persons.get(i), persons.get(end)) < 0) {
                Person temp = persons.get(counter);
                persons.set(counter, persons.get(i));
                persons.set(i, temp);
                counter++;
            }
        }
        Person temp = persons.get(end);
        persons.set(end, persons.get(counter));
        persons.set(counter, temp);

        return counter;
    }

    public static void quickSort(List<Person> persons, Comparator<Person> personComparator, int begin, int end) {
        if (end <= begin) return;
        int pivot = getPivot(persons, personComparator, begin, end);
        quickSort(persons, personComparator, begin, pivot - 1);
        quickSort(persons, personComparator, pivot + 1, end);
    }

}

