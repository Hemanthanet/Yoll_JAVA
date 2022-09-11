package com.company;

import java.util.Scanner;

public class PasswordProgram {
    public static void main(String[] args) {
        /*
 Write password program
Set correct password as: "Desk45"
User has 3 chances to enter correct password
If user enters incorrect password: "Incorrect password. Please, try again. You have 2 chances left"
If user doesn't enter in 3 tries, then print: "Sorry. Your account is locked "
If user enters correct password, print: "Welcome";
         */

        Scanner scn=new Scanner(System.in);
        String correctpassword="Desk45";
        String userInput;
        System.out.println("Enter your password : ");
        for(int i=3;i>0;i--)
        {
           String pw=scn.next();
           if(pw.equals(correctpassword))
           {
               System.out.println("Welcome");
               continue;

           }
           else
           {
               System.out.println("Incorrect password. Please, try again. You have "+(i-1) +" chances left");
           }

        }
        System.out.println("Sorry. Your account is locked ");
    }
}
