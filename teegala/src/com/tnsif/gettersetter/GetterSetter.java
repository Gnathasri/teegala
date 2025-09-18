package com.tnsif.gettersetter;

class Student {
    
    private String name;
    private int age;
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        if (age > 0) {   
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Gnatha");
        s1.setAge(21);
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}
