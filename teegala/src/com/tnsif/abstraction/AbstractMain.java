package com.tnsif.abstraction;

public class AbstractMain {
	public static void main(String[] args) {
		Square s=new Square(3);
		s.calArea();
		s.show();
		Rectangle r=new Rectangle(9,3);
		r.calArea();
		r.show();
	}

}
