package com.tnsif.exception;

public class UnchckedException {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Can't divide a number by zero "+e);
		}
	}
}
