package com.company.module04_loops;

public class Task10 {
    public static void main(String[] args) {
        // Write a program to print increments of 5 from 0 to 100.
        		// Option 1
		System.out.println("Update with 5");
		for(int i = 0; i <= 100; i += 5) {
			System.out.print(i + " ");
		}

		// Option 2
		System.out.println("\nUse if statement");
		for(int i = 0; i <= 100; i++) {

			if(i%5 == 0) {
				System.out.print(i + " ");
			}

		}
    }
}
