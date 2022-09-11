package com.tutoring.day4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        String newArr[];
        System.out.println("Enter the your sentence  with (,) comma");
        String userInput=scn.nextLine();
        newArr=userInput.split(",");
        System.out.println(Arrays.toString(newArr));
        String newArr2[]=Arrays.copyOf(newArr, 2); //also use  copyOfRange()
        System.out.println(Arrays.toString(newArr2));



        // to char array creation
//        char[] eachChar=userInput.toCharArray();
//        System.out.println(Arrays.toString(eachChar));


    }
}
