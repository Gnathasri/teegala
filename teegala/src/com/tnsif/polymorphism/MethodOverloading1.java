package com.tnsif.polymorphism;
//Different in number of parameters
class Addition
{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class MethodOverloading1 {
	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println("The sum of two numbers:"+a.add(11,28));
		System.out.println("The sum of three numbers:"+a.add(57,29,8));	
	}
}
