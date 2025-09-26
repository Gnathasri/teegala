package com.tnsif.collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // push() - add elements
        stack.push("JAVA");
        stack.push("PYTHON");
        stack.push("C");
        System.out.println("Stack: " + stack);

        // peek() - see top element
        System.out.println("Top element: " + stack.peek());

        // pop() - remove top element
        stack.pop();
        System.out.println("After pop: " + stack);

        // search() - position of element (1-based from top)
        System.out.println("Position of JAVA: " + stack.search("JAVA"));

        // empty() - check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}

