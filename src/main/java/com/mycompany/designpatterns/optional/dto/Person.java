package com.mycompany.designpatterns.optional.dto;

import java.util.Optional;

public class Person {

    private Optional<Car> car;

    private int age;

    public int getAge() {
        return age;
    }

    public Optional<Car> getCar() {
        return car;
    }
}
