package com.tutoring.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter a number ");
        int input = scn.nextInt();

        //----
            int numOfRows=input%3==0? input/3 :(input/3)+1;
        //----
        int row;
        int column=3 ;//fixed
        String [][] finalArray= null;
        String [][] raggedArray=null;

        if(input%3==0) {

            row=input/3;
            finalArray= new String[row][3];

        }else
        {
            row=(input/3)+1;
            finalArray = new String[row][3];

        }
    }
}
