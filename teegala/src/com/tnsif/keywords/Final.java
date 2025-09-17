package com.tnsif.keywords;

final class Vehicle {
    // final variable (constant value)
	final int speedLimit = 80;

    // final method (cannot be overridden)
	final void displayLimit() {
     System.out.println("Speed Limit is: " + speedLimit + " km/h");
 }
}
public class Final{
 public static void main(String[] args) {
     Vehicle v = new Vehicle();
     v.displayLimit();
 }
}

