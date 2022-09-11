package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Array_lesson_task_02 {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers ");
        int num1,num2,num3,num4,num5;
        int [] numbersArr=new int[5];
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter 1 numbers ");
        num1=scn.nextInt();
        numbersArr[0]=num1;

        System.out.println("Enter 2 numbers ");
        num2=scn.nextInt();
        numbersArr[1]=num2;

        System.out.println("Enter 3 numbers ");
        num3=scn.nextInt();
        numbersArr[2]=num3;

        System.out.println("Enter 4 numbers ");
        num4=scn.nextInt();
        numbersArr[3]=num4;

        System.out.println("Enter  numbers ");
        num5=scn.nextInt();
        numbersArr[4]=num5;

        System.out.println(Arrays.toString(numbersArr ));


    }
}
