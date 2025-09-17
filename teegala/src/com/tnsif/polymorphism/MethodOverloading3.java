package com.tnsif.polymorphism;

public class MethodOverloading3 {
	
	    public void display(int a, String b) {
	        System.out.println("Method with int and String: " + a + ", " + b);
	    }

	    public void display(String b, int a) {
	        System.out.println("Method with String and int: " + b + ", " + a);
	    }

	    public static void main(String[] args) {
	        MethodOverloading3 obj = new MethodOverloading3();

	        obj.display(10, "Gnatha");   // calls display(int, String)
	        obj.display("Sri", 20);   // calls display(String, int)
	    }
}
