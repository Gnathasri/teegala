package com.tnsif.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("London"); 
        System.out.println("Cities HashSet: " + cities);

        System.out.println("Contains Tokyo? " + cities.contains("Tokyo"));
        
        cities.remove("Paris");
        System.out.println("After removing Paris: " + cities);
        
        System.out.println("Number of cities: " + cities.size());
        
        System.out.println("Is HashSet empty? " + cities.isEmpty());

        cities.clear();
        System.out.println("After clear: " + cities);
    }
}

