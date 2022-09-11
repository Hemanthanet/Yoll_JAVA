package com.company;

import java.util.Scanner;

public class PasswordAttempt {
    public static void main(String[] args) {
        /*
        Write password program
		Set correct password as: "Desk45"
		User has 3 chances to enter correct password
		If user enters incorrect password: "Incorrect password. Please, try again. You have 2 chances left"
		If user doesn't enter in 3 tries, then print: "Sorry. Your account is locked "
		If user enters correct password, print: "Welcome";
         */
        Scanner scn= new Scanner(System.in);
        String password="Desk45";
        String userInput="";


        for(int i =2;i>=0;i--){

            System.out.println("Enter your password  : ");
            userInput=scn.next();
            if(userInput.equals(password))
            {
                System.out.println("Welcome !");
            }else
            {
                System.out.println("Incorrect password. Please, try again. You have "+i+" chances left");
            }
        }
        System.out.println("Sorry. Your account is locked ");

    }
}
