package com.gnathasri.assignment;

import com.gnathasri.assignment.employees.*;
import com.gnathasri.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        
        Manager manager = new Manager("Gnatha", 101, 75000, "HR");
        Developer developer = new Developer("Sri", 102, 60000, "Java");

      
        EmployeeUtilities utils = new EmployeeUtilities();

        // Print details
        System.out.println("===Employee Details===");
        System.out.println();
        utils.printEmployee(manager);
        utils.printEmployee(developer);

        // Increase salaries
        utils.increaseSalary(manager, 10);
        utils.increaseSalary(developer, 15);

        // Print updated details
        System.out.println("===After Salary Increment===");
        System.out.println();
        utils.printEmployee(manager);
        utils.printEmployee(developer);
    }
}

