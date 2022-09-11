package com.company.methods;

import java.util.Scanner;

public class Lesson2_01 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int firstInt,secondInt;
        System.out.println("Enter first name : ");
        firstInt=scn.nextInt();
        System.out.println("Enter second number ");
        secondInt=scn.nextInt();

        System.out.println(findDifferent(firstInt, secondInt));
        System.out.println(findDifferent1(23,45));

    }

    public static int findDifferent(int num1,int num2)
    {
        int diff=0;
        if(num1>num2){
            diff=num1-num2;
        }else
        {
            diff=num2-num1;
        }
        return diff;
    }

    //option 2

    public static int findDifferent1(int num1,int num2)
    {

        if(num1>num2){
             return num1-num2;
        }else
        {
            return num2-num1;
        }

    }



}
