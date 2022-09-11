package com.cordboard;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ApartmentLeasing {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int startingPrice=0;
        System.out.println("Enter number of bedrooms: ");
        int numberOfBedrooms=scan.nextInt();

        if(numberOfBedrooms==1)
        {
            startingPrice=1100;
            System.out.println("One Bedroom Selected");
            System.out.println("set startingPrice as$ "+startingPrice );
        }else if(numberOfBedrooms==2){
            startingPrice=1850;
            System.out.println("Two Bedroom Selected");
            System.out.println("set startingPrice as $"+startingPrice );

        }else if(numberOfBedrooms==3){
            startingPrice=2550;
            System.out.println("Three Bedroom Selected");
            System.out.println("set startingPrice as $"+startingPrice );
        }else {
            System.out.println("No such Bedrooms available");
        }
    }
    /*
    In this assignment, you will write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

Using Multi Way If statement create this program logic:

numberOfBedrooms is 1

	print "One Bedroom Selected"

	print "set startingPrice as $1100"

numberOfBedrooms is 2

	print "Two Bedroom Selected"

	print "set startingPrice as $1850"

numberOfBedrooms is 3

	print "Three Bedroom Selected"

	print "set startingPrice as $2550"

All other inputs:

	print "No such Bedrooms available"

Print "Starting Price: $value"

     */
}
