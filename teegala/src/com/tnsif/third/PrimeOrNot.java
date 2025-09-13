package com.tnsif.third;

public class PrimeOrNot {
	
		    boolean isPrime(int n) {
		        int flag = 0;
		        for (int i = 1; i <= n; i++) {
		            if (n % i == 0) {
		                flag++;
		            }
		        }
		        if (flag == 2) {
		            return true;
		        } else {
		            return false;
		        }
		    }

		    public static void main(String[] args) {
		        int n = 5;
		        PrimeOrNot obj = new PrimeOrNot();
		        boolean result = obj.isPrime(n); 
		        if (result) { 
		            System.out.println(n + " is a prime number.");
		        } else {
		            System.out.println(n + " is not a prime number.");
		        }
		    }
         }
