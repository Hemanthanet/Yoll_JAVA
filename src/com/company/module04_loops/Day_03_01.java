package com.company.module04_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Day_03_01 {

    /*
             //		Declare two strings - word and separator
            //		Declare int  count
            //		Ask user to enter word, separator and count values
            //		Assign entered values to variables and print a big string
            //		That is made of count occurrences of the word, separated by the separator string.
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // Option 1
        Scanner scan = new Scanner(System.in);

        String word;
        String separator;
        String result = "";
        int count;

        System.out.println("Enter the word:");
        word = scan.next();

        System.out.println("Enter the separetor:");
        separator = scan.next();

        System.out.println("Enter the count: ");
        count = scan.nextInt();

        for (int i = 1; i <= count; i++) {

            result += word + separator;

        }

        //AppleWWWAppleWWWAppleWWW
        System.out.println(result.substring(0, result.lastIndexOf(separator)));

        //option 2


    }
}
