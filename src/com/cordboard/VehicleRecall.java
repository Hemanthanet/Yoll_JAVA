package com.cordboard;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {

        /*

     Honda Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.
-Create a scanner object
-Create int variable named vehicleYear
-Display prompt: "Enter vehicle's year:"
input: 1996
if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"
Otherwise, display message:
"Your vehicle is fine, enjoy!"
         */
        Scanner scan = new Scanner(System.in);
        int vehicleYear;

        System.out.println("Enter vehicle's year:");
        vehicleYear = scan.nextInt();
        //Write Your Code Here
        if(vehicleYear==1995 || vehicleYear==1996 || vehicleYear==197 || vehicleYear==1998 ||
                vehicleYear==2001 || vehicleYear==2002 ||
                vehicleYear==1995 || vehicleYear==1995 ||
                vehicleYear==2004 || vehicleYear==2005 || vehicleYear==2006 ||
                vehicleYear==2015 || vehicleYear==2016 || vehicleYear==2017 ){
            System.out.println("Your vehicle needs to be recalled!");
        }
        else
        {
            System.out.println("Your vehicle is fine, enjoy!");
        }


    }
}
