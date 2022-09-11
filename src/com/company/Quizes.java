package com.company;

import java.util.Scanner;

public class Quizes {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter your f name ");
        String fname=scn.nextLine();
        //scn.nextLine();

        System.out.println("Enter your l name ");
        String lname=scn.nextLine();

        System.out.println(fname+ "" + lname);
        char f=fname.charAt(0);
        char l=lname.charAt(0);
        System.out.println("first name starts by " +f+" and  last name started by " + l );




    }
}
