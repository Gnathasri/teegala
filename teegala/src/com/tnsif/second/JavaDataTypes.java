package com.tnsif.second;

public class JavaDataTypes {
	public static void main(String[] args) {
		byte age = 25;   
		short students= 120;  
		int population= 1000000;  
		long distance= 384400000L;  
		float temperature= 36.6f;  
		double price= 999.99;  
        char grade= 'A';  
        boolean isSwitchOn = true; 
        String name = "Gnathasri";
        int[] a=new int[] {0,1,2,3};

		System.out.println("Java Data Types:");
        System.out.println("Age (byte): " + age + " years");
        System.out.println("Students in class (short): " + students);
        System.out.println("City population (int): " + population);
        System.out.println("Distance (long): " + distance+ " meters");
        System.out.println("Body Temperature (float): " + temperature + " Celcius");
        System.out.println("Product Price (double): $" + price);
        System.out.println("Student Grade (char): " + grade);
		System.out.println("Switch On? (boolean): " + isSwitchOn);
		
        System.out.println("My Name is (String): " + name);	
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
	}

}
