package com.tnsif.collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        
        Vector data = new Vector();
        data.add(101);                  
        data.add("Gnatha");              
        data.add(85.5);                 
        data.add(true);                 
        data.add('S');  
    
        System.out.println("Vector data: " + data);
        
        System.out.println("Element at index 1: " + data.get(1));

        data.set(2, null);  
        System.out.println("After updating index 2: " + data);

        data.remove("Gnatha");
        System.out.println("After removing 'Gnatha': " + data);
        
        System.out.println("Size of Vector: " + data.size());
    }
}

