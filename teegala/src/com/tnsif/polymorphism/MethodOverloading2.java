package com.tnsif.polymorphism;

//Different in type of parameters

class Multiplication{
	public void product(int x,int y) {
		int product;
		product=x*y;
		System.out.println("Product of two numbers(integer):"+product);	
	}
	public void product(double x,double y) {
		double product;
		product=x*y;
		System.out.println("Product of two numbers(double):"+product);	
	}
}
public class MethodOverloading2 {
	public static void main(String[] args) {
		Multiplication m=new Multiplication();
		m.product(55,49);
		m.product(9.0, 0.5);
	}
}
