package com.company;

import java.util.Scanner;

public class AskJava {
    public static void main(String[] args) {
        final double price=2.50;
        final int passingScore=50;
        final int resturentSpace=30;
        final int winningTicket=91009177;
        final int allowedAgeToTakeTest=16;
        boolean status=false;
        String hiJava="Hi Java, ";


        Scanner scn=new Scanner(System.in);

        System.out.println("WELCOME TO ASK JAVA");
//        System.out.println("Press Any Key to Continue...");
//         try {
//             System.in.read();
//             scn.nextLine();
//         }
//         catch (Exception e)
//         {
//             System.out.println(e);
//         }


        System.out.println("Question 01 ");
        System.out.println(hiJava +"do I have enough change to buy a snack?");
        System.out.println("Java: How much do you have? ");
        double userInputPrice=scn.nextDouble();
        if(userInputPrice>=price)
        {
            status=true;
        }
        else
        {
            status =false;
        }
        System.out.println("Java : "+status);
        System.out.println("----------------------------------------------- \n");
        System.out.println("Question 02 ");
        System.out.println(hiJava +"will I pass the exam?");
        System.out.println("Java: How much did you get?");
        int userInputPassingScore=scn.nextInt();
        if(userInputPassingScore>=passingScore)
        {
            status=true;
        }
        else
        {
            status =false;
        }
        System.out.println("Java : "+status);
        System.out.println("----------------------------------------------- \n");
        System.out.println("Question 03 ");
        System.out.println(hiJava +"can everyone come to my birthday party?");
        System.out.println("Java: How many guests will you have? ");
        int userInputResturantSpace=scn.nextInt();
        if(userInputResturantSpace<=resturentSpace)
        {
            status=true;
        }
        else
        {
            status =false;
        }
        System.out.println("Java : "+status);
        System.out.println("----------------------------------------------- \n");
        System.out.println("Question 04 ");
        System.out.println(hiJava +"will I win the lottery?");
        System.out.println("Java:  What is your number combination? ");
        int userInputWinningTicket=scn.nextInt();
        if(userInputWinningTicket==winningTicket)
        {
            status=true;
        }
        else
        {
            status =false;
        }
        System.out.println("Java : "+status);
        System.out.println("----------------------------------------------- \n");
        System.out.println("Question 05 ");
        System.out.println(hiJava +"can I take the driving test?");
        System.out.println("Java: How old are you?");
        int userInputAllowedAgeToTakeTest=scn.nextInt();
        if(userInputAllowedAgeToTakeTest>=allowedAgeToTakeTest)
        {
            status=true;
        }
        else
        {
            status =false;
        }
        System.out.println("Java : "+status);
        System.out.println("----------------------------------------------- \n");
        System.out.println("THANK YOU FOR USING \"ASK JAVA\"");


    }
}
