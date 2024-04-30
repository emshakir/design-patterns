package com.learnings.design_patterns.builder.User;

public class DriverManager {

    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Mohammad Shakir")
                .lastName("Pasha")
                .age("27")
                .address("Hyderabad")
                .build();

        System.out.println(user);
    }
}
