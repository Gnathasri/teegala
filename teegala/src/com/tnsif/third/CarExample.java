package com.tnsif.third;

class Car{
	String color = "Blue";
	String model = "BMW";
	int no_of_seats = 6;
	
	public void start() {
		System.out.println("Car is starting");
	}
	
	public void stop() {
		System.out.println("Car is stoping");
	}
	
	public void drifts() {
		System.out.println("Car is drifting");
	}
}

public class CarExample{

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.model);
		System.out.println(c.no_of_seats);
		c.start();
		c.stop();
		c.drifts();
	}
}