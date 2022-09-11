package com.company;

import java.util.Scanner;

public class ValidateFinalPrice {
    public static void main(String[] args) {
        double oldPrice,savingsAmount, finalPrice;
        Scanner scn=new Scanner(System.in);
        boolean isPass=false;


        System.out.println("Enter the old item price:");
        String userInputOldPrice=scn.next();

        System.out.println("Enter the savings:");
        String userInputSavingValue=scn.next();

        System.out.println("Enter the final price: ");
        String userInputFinalPrice=scn.next();

        oldPrice=Double.parseDouble(userInputOldPrice);
        savingsAmount=Double.parseDouble(userInputSavingValue);
        finalPrice=Double.parseDouble(userInputFinalPrice);
        if(oldPrice==(savingsAmount+finalPrice))
        {
            isPass=true;
        }

        System.out.println("Output: Test pass[" +isPass+"]");









    }
}
