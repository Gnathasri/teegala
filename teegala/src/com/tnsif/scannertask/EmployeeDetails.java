package com.tnsif.scannertask;
import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String ename = sc.nextLine();
        System.out.println("Employee Name: " + ename);
        System.out.println("Enter your id:");
        int eid = sc.nextInt();
        System.out.println("Employee Id: " + eid);
        System.out.println("Enter your salary:");
        double esalary = sc.nextDouble();
        System.out.println("Employee Salary: " + esalary);
        sc.nextLine();
        System.out.println("Enter your location:");
        String elocation = sc.nextLine();
        System.out.println("Employee Location: " + elocation);

        sc.close();
    }
}
