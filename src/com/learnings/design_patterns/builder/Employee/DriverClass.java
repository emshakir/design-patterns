package com.learnings.design_patterns.builder.Employee;

public class DriverClass {

    public static void main(String[] args) {

        Employee employee = Employee.builder()
                .firstName("Mohammad Shakir")
                .lastName("Pasha")
                .mail("emshakir97@gmail.com")
                .build();

        System.out.println(employee);
    }
}
