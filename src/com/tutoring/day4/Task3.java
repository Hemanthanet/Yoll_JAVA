package com.tutoring.day4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String userInput=scn.nextLine();
        String arr[]=userInput.split(" ");
        String firstElement=arr[0];
        String lastElement=arr[arr.length-1];
        if(arr.length>1)
        {
            System.out.println(firstElement.charAt(0) + "" + firstElement.charAt(firstElement.length()-1));

            System.out.println(lastElement.charAt(0) + "" + lastElement.charAt(lastElement.length()-1));
        }
    }
}
