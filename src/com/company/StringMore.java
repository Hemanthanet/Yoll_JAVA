package com.company;

import java.util.Scanner;

public class StringMore {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("--Welcome to Shopping Card--");
        System.out.println("Enter Total Price");
        double totalPrice=scn.nextDouble();
        System.out.println("Do you have a membership ? Enter YES or NO");
        String membership=scn.next();
        double discount=0.0;
        if(membership.equals("YES"))
        {
            System.out.println("What kind of membership do you have ? Enter Gold or Silver");
            String membershipType=scn.next();
            if(membershipType.equals("Gold"))
            {
                discount=totalPrice*10/100;
                totalPrice-=discount;
                System.out.println("Your discount amount is  " +discount+"and total is " + totalPrice);
            }else if(membershipType.equals("Silver")){

                discount=totalPrice*5/100;
                totalPrice-=discount;
                System.out.println("Your discount amount is  " +discount+"and total is " + totalPrice);
            }else {
                System.out.println("Sorry ! Your membership card is not accepted,Try again ");

            }
        }
        else {

            System.out.println("You don't have a discount " + totalPrice);

        }



    }
}
