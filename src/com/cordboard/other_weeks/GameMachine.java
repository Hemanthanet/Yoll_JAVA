package com.cordboard.other_weeks;

import java.util.Scanner;

public class GameMachine {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int numberOfCoupons = scan.nextInt();
        System.out.println("Enter your number of coupons : ");
        int candy;
        int gumballs;
        int balance = 0;
        if (numberOfCoupons >= 3) {
            //when Coupon amount  between 3-10
            if (numberOfCoupons >= 3 && numberOfCoupons < 10) {
                balance = numberOfCoupons;
            }
            //when Coupon amount  more than 10
            if (numberOfCoupons >= 10) {
                candy = numberOfCoupons / 10;
                balance = numberOfCoupons % 10; // keep remaining balance
                System.out.println("Number of Candies: " + candy);
            }

            //if coupon amount less than 3 and  between 3-10
            if (balance >= 3) {
                gumballs = balance / 3;
                System.out.println("Number of Gumballs: " + gumballs);
            }

        //  coupon less than 3
        } else {
            System.out.println("Not enough coupons");
        }
    }
}

