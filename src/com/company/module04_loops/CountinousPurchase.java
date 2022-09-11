package com.company.module04_loops;

import java.util.Scanner;

public class CountinousPurchase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to enter an item price?: ");
        String userAnswer = scan.next();

        double total = 0.0;

        while(userAnswer.equalsIgnoreCase("yes")) {

            System.out.println("Enter the item price: ");
            double itemPrice = scan.nextDouble();

            total += itemPrice;

            System.out.println("Would you like to enter another item price?:");
            userAnswer = scan.next();

        }

        System.out.println("Your total is: $" + (Math.round(total*100.0)/100.0));



    }
}
