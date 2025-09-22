package com.tnsif.exception;

public class NestedTry {

	public static void main(String[] args) {
		try {
			int[] numbers = {10, 20, 30};
			System.out.println("Outer try started.");
			try {
				int result = numbers[1] / 0; 
				System.out.println("Result: " + result);
		    }
			catch (ArithmeticException e) {
				System.out.println("Inner catch: Cannot divide by zero.");
		    }
		}
			catch (ArrayIndexOutOfBoundsException e) {
		        System.out.println("Outer catch: Invalid array index.");
		    }
		    
			finally {
		            System.out.println("Finally block always executes.");
		    }
	}
}

