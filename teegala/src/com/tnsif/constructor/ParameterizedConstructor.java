package com.tnsif.constructor;

class Rectangle{
	int a,b;
	Rectangle(int length,int breadth)
	{
		a=length;
		b=breadth;
		System.out.println("The length is:"+a);
		System.out.println("The breadth is:"+b); 
	}
	public void area()
	{
		int area=a*b;
		System.out.println("The Area is:"+area);
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(25,10);
		r.area();
	}

}
