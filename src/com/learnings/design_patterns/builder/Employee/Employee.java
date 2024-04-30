package com.learnings.design_patterns.builder.Employee;

public class Employee {

    private String firstName;
    private String lastName;
    private String email;


    public static Employee builder() {
        return new Employee();
    }

    public Employee lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee mail(String email) {
        this.email = email;
        return this;
    }

    public Employee build() {
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
