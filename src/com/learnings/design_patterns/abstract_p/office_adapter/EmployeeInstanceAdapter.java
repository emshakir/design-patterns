package com.learnings.design_patterns.abstract_p.office_adapter;

public class EmployeeInstanceAdapter implements Customer {

    private final Employee employee;

    public EmployeeInstanceAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
