package com.tnsif.second;

public class JavaVariables {
	    //Instance variable (inside class)
		String name = "Gnathasri";
		void display() {
		    // Local variable (inside method)
		    int age = 20;
		    System.out.println("Name (instance variable): " + name);
		    System.out.println("Age (local variable): " + age);
		}
       
		public static void main(String[] args) {     
		JavaVariables obj =new JavaVariables();
		obj.display();
		}
}
