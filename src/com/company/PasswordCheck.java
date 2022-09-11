package com.company;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double totalPrice=0.0;
        System.out.println("Enter how many masks do you want ot purchase ?");
        int maskAmount=scn.nextInt();
        if(maskAmount>100 && maskAmount<500)
        {
            totalPrice=2.25*maskAmount;
        }else if (maskAmount>500  && maskAmount<1000)
        {
            totalPrice=2.00*maskAmount;
        }else if(maskAmount>1000){
            System.out.println("Sorry We don't have that man in stock !");
        }else
        {
            totalPrice=2.50*maskAmount;
        }
        System.out.println("User requested " + maskAmount + " Masks");
        System.out.println("User total amount is " + totalPrice + "$");
    }
}
