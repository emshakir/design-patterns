package com.learnings.design_patterns.builder.User;

import java.time.LocalDate;

public class User {
    private String name;
    private String age;
    private String address;

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.getFirstName() + " " + userBuilder.getLastName();
        this.age = userBuilder.getAge();
        this.address = userBuilder.getAddress();
    }

    public String getFirstName() {
        return name;
    }

    public String getBirthday() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
