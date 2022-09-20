package com.cordboard.other_weeks;

import java.util.Scanner;

public class BurgerORChecken {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();

        //Your Code Here
        float a;
        if(in.equals("burger") || in.equals("chicken"))
        {
            a=10F;
            System.out.println(a);
        }
        if(in.equals("soda"))
        {
            a=2.0F;
            System.out.println(a);
        }


        /*
        Instructions from your teacher:

a fast food company has two main order types, burger meal and chicken meal.

both have the same prices.

so if a cashier enters "burger" or "chicken" he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken" and output the price 10.0

also if input is "soda" output 2.0

for example:

in = "burger"

output: 10.0

in = "chicken"

output: 10.0

in = "soda"

output: 2.0

hint: OR operator in java is  ||
         */
    }
}
