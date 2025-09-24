package com.tnsif.multithreading;

public class JoinMain {
    public static void main(String[] args) {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();
        JoinDemo t3 = new JoinDemo();
        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t3.start();
        try {
            t3.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads have finished. Main thread ends.");
    }
}
