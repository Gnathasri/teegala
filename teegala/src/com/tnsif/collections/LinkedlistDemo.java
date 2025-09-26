package com.tnsif.collections;

import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // add() - adding elements
        names.add("GNATHA");
        names.add("SRI");
        names.add("VANDHANA");
        System.out.println("Names: " + names);

        // addFirst() & addLast()
        names.addFirst("RAVALI");
        names.addLast("RAKSHITHA");
        System.out.println("After addFirst & addLast: " + names);

        // get() - access element
        System.out.println("Element at index 2: " + names.get(2));

        // remove() - remove element
        names.remove("SRI");
        System.out.println("After removing Bob: " + names);

        // size()
        System.out.println("Size of list: " + names.size());
    }
}
