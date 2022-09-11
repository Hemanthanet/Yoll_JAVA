package com.company.module04_loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        double total=0.0;
        String userAnswer;

        do {
            System.out.println("Enter price ");
            double itemPrice=scn.nextDouble();
            total+=itemPrice;
            System.out.println("Do you want to countinue ?");
            userAnswer=scn.next();

        }while(userAnswer.equalsIgnoreCase("yes"));

        System.out.println("your total  is " +total);
        }

//        int count=1;
//        do{
//            System.out.println("count ="+ count);
//            count++;
//
//        }while (count>=5);

    }

