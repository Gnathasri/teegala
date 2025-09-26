package com.tnsif.collections;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
        //add() - Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        System.out.println("Initial List: " + list);

        //add(index, element) - Insert at specific index
        list.add(2, "Grapes");
        System.out.println("After inserting Grapes at index 2: " + list);

        //get() - Access element by index
        System.out.println("Element at index 1: " + list.get(1));

        // remove(index) - Remove element by index
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        //remove(object) - Remove specific element
        list.remove("Orange");
        System.out.println("After removing Orange: " + list);

        //contains() - Check if element exists
        System.out.println("Contains Mango? " + list.contains("Mango"));

        //size() - Get number of elements
        System.out.println("Size of list: " + list.size());
       
        //clear() - Remove all elements
        list.clear();
        System.out.println("After clearing list: " + list);
        
    }

}



