package com.cordboard.other_weeks;

import java.util.Scanner;

public class Vendingmachine02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int useritemPrice;
        int quarters=0 ;
        int dimes=0;
        int nickels=0;
        System.out.println("Enter Item price");
        useritemPrice = keyboard.nextInt();

        if (useritemPrice >= 25 && useritemPrice <= 100 && useritemPrice % 5 == 0) {
            int itemPrice = 100 - useritemPrice;
            System.out.println("Your balance is "+ itemPrice);
            if (itemPrice>=25) {
                quarters = itemPrice / 25;
                itemPrice = itemPrice-(quarters*25);


            }

            if (itemPrice>=10) {
                dimes = itemPrice / 10;
                itemPrice = itemPrice-(dimes*10);
            }
            if (itemPrice>=5) {
                nickels= itemPrice/5;
            }
            System.out.println("Your change is "+quarters+" quarters , "+dimes+" dimes and "+nickels+" nickels.");

        } else {
            System.out.println("Invalid price!");
        }


    }
}

