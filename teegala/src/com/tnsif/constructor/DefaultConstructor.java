package com.tnsif.constructor;

class Box{
	int x=2,y=8,z=5;
	Box(){
		System.out.println("This is a Box(Constructor)");
	}
	public void volume() {
		int volume=x*y*z;
		System.out.println("The volume is "+volume);
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		Box b=new Box();
		b.volume();
	}
}
