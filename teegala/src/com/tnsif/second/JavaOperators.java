package com.tnsif.second;

public class JavaOperators {

	public static void main(String[] args) {

		int a = 10, b = 5;
		//Arithmetic Operators
		System.out.println("Arithmetic operators:");
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println();
		
		//Relational operators
		System.out.println("Relational operators:");
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a > b: " + (a > b));
		System.out.println("a <= b: " + (a <= b));
		System.out.println("a >= b: " + (a >= b));
		System.out.println();
		
		//Assignment operator
		int c = 5;
		System.out.println("Assignment operators:");
		System.out.println("c = " + c);
		c += 2;
		System.out.println("c += 2: " + c);
		c -= 2;
		System.out.println("c -= 2: " + c);
		c *= 2;
		System.out.println("c *= 2: " + c);
		c /= 2;
		System.out.println("c /= 2: " + c);
		c %= 2;
		System.out.println("c %= 2: " + c);
		System.out.println();
		
		//Logical operators
		boolean x = true, y = false;
		System.out.println("Logical operators:");
		System.out.println("x && y: " + (x && y));
		System.out.println("x || y: " + (x || y));
		System.out.println("!x: " + (!x));
		System.out.println();
		
		//Unary Operators
		int d = 7;
        System.out.println("Unary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));
        System.out.println("d++ = " + (d++));
        System.out.println("--d = " + (--d));
        System.out.println("d-- = " + (d--));
        System.out.println();
         
        //Ternary Operator(Conditional Operators)
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Max of a and b: " + max);
        System.out.println();
        
        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    
	}
}
