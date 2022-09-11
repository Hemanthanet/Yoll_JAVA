package com.tutoring.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner  scn = new Scanner (System.in);
        String userInput=scn.nextLine();
        String arr[]=userInput.split(",");
        int middle_index=arr.length/2;
        if(arr.length%2==1) {
            System.out.println(arr[middle_index]);
        }else
        {
            System.out.println(arr[middle_index-1]);
            System.out.println(arr[middle_index]);
        }



    }
}
