package com.cordboard.week09;

import java.util.Scanner;

public class DoWhileShoppingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        String userAnswer;


        do{

            System.out.println("Enter a price:");
            double itemPrice = scan.nextDouble();

            total += itemPrice;

            System.out.println("Would you like to enter a price for another item?");
            userAnswer = scan.next();


        }while(userAnswer.equalsIgnoreCase("yes"));

        System.out.println("Your total is: $" + (Math.round(total * 10.0) / 10.0));
    }
}
