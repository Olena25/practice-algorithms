package com.intellias.algorithms.calculation;

import com.intellias.algorithms.Person;
import com.intellias.algorithms.PersonsUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = PersonsUtils.createPersons(100_000);

        long startTimeMillis = System.currentTimeMillis();

        int counter = persons.size();

        // Complexity O(n^2)
        for (int i = 0; i < persons.size(); i ++) {
            Person firstPerson = persons.get(i);
            for(int j = i + 1; j < persons.size(); j ++) {
                Person secondPerson = persons.get(j);
                if(firstPerson.equals(secondPerson)) {
                    counter--;
                }
            }
        }

        System.out.println(counter);

        System.out.println("Calculation took " + (System.currentTimeMillis() - startTimeMillis) + " ms");
    }

}
