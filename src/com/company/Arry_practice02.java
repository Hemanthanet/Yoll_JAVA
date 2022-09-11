package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Arry_practice02 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
 //       int numbers[]=;System.out.println("Enter 5 numbers ");
//        int num1,num2,num3,num4,num5;
//        int [] numbersArr=new int[5];
   // Scanner scn=new Scanner(System.in);
//
//        System.out.println("Enter 1 numbers ");
//        num1=scn.nextInt();
//        numbersArr[0]=num1;
//
//        System.out.println("Enter 2 numbers ");
//        num2=scn.nextInt();
//        numbersArr[1]=num2;
//
//        System.out.println("Enter 3 numbers ");
//        num3=scn.nextInt();
//        numbersArr[2]=num3;
//
//        System.out.println("Enter 4 numbers ");
//        num4=scn.nextInt();
//        numbersArr[3]=num4;
//
//        System.out.println("Enter  numbers ");
//        num5=scn.nextInt();
//        numbersArr[4]=num5;
//
//        System.out.println(Arrays.toString(numbersArr ));

        System.out.println("Enter  numbers ");
        int numbers[];
        int []n={scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt()};
        System.out.println(Arrays.toString(n));
        System.out.println(n[0]+n[1]+n[2]+n[3]+n[4]);

    }
}
