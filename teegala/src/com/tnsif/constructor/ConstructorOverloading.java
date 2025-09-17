package com.tnsif.constructor;

class Details{
    String name;
    String rollno;

    // Constructor 1: no parameters
    Details() {
        System.out.println("Student Details");
    }

    // Constructor 2: one parameter
    Details(String n) {
        name = n;
    }

    // Constructor 3: two parameters
    Details(String n, String r) {
        name = n;
        rollno = r;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No.: " + rollno);
    }
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Details obj1 = new Details();
		Details obj2 = new Details("Gnathasri");
        Details obj3 = new Details("Gnathasri","22R91A73A9");
        obj1.display();   
        obj2.display();
        obj3.display();
	}
}