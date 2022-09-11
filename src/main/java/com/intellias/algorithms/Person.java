package com.intellias.algorithms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
public class Person {
    private int height;
    private int weight;
    @EqualsAndHashCode.Exclude
    private int age;
}
