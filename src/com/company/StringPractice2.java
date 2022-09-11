package com.company;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Sentence ");
        String userSentence= scn.nextLine();
        System.out.println("Enter Word");
        String userWord=scn.nextLine();
        if(userSentence.contains(userWord))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
