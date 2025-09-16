package com.gnathasri.assignment.utilities;

import com.gnathasri.assignment.employees.Employee;
public class EmployeeUtilities {

    public void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
    }

    public void printEmployee(Employee employee) {
        employee.displayInfo();
    }
}
