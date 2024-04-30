package com.learnings.design_patterns.abstract_p.office_adapter;

public class DriverClass {

    public static void main(String[] args) {

        // Adapter using Is-A relationship
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        populateEmployeeData(employeeClassAdapter);
        String card = BusinessCardDesigner.designCard(employeeClassAdapter);
        System.out.println(card);

        // Adapter using Has-A relationship
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeInstanceAdapter employeeInstanceAdapter = new EmployeeInstanceAdapter(employee);
        String cardAgain = BusinessCardDesigner.designCard(employeeInstanceAdapter);
        System.out.println(cardAgain);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("All safe Cyber security, New York City, New York");
    }
}
