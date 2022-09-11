package com.company.module04_loops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        Write a program that calculates the sum of numbers entered by the user until user enters 0.
        After user enters 0, then print the total of numbers entered.
         */

        Scanner scn=new Scanner(System.in);
        int tatal=0;
        int userInput=scn.nextInt();
        do{

            tatal+=userInput;
            userInput=scn.nextInt();

        }while(userInput!=0);
        System.out.println(tatal);
        

    }
}
