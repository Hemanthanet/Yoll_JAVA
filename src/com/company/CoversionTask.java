package com.company;

import java.util.Scanner;

public class CoversionTask {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int numberInt;

        System.out.println("Enter your Number : ");
        String number=scn.next();

        //convert to Integer
        numberInt = Integer.parseInt(number);
        /*also we can use
        numberInt=Integer.valueOf(number);
        */
        numberInt+=100;

        System.out.println(numberInt<200);


    }
}
