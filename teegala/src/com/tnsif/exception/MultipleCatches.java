package com.tnsif.exception;

public class MultipleCatches {

	public static void main(String[] args) {
        try {
            
            int a = 10;
            int b = 0;
            int c = a / b; 
        }
        catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException: " + ae);
        }
        catch (NullPointerException ne) {
            System.out.println("Caught NullPointerException"+ne);
        }
        catch (Exception e) { 
            System.out.println("Caught some other Exception: " + e);
        }
        finally {
            System.out.println("Finally block always executes.");
        }
	}
}
