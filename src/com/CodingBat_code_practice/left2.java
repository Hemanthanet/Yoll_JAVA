package com.CodingBat_code_practice;

import java.util.Scanner;

public class left2 {
    public static void main(String[] args) {
        /*
        Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
         The string length will be at least 2.
            left2("Hello") → "lloHe"
            left2("java") → "vaja"
            left2("Hi") → "Hi"
         */
        //Site solution
        String  a ="ab";

        System.out.println(a.substring(2) + a.substring(0, 2));

        Scanner scanner=new Scanner(System.in);
        String userInput=scanner.next();
        String temp="";
        if(userInput.length()>1){
            String firstPart=userInput.substring(0, 2);
            String secondPart=userInput.substring(2);
            temp=secondPart+firstPart;
        }else if(userInput.length()==1){
            String firstChar=String.valueOf(userInput.charAt(0));
            String lastChar=String.valueOf(userInput.charAt(1));
            temp=lastChar+firstChar;
        }
        else
        {
            temp=userInput;

        }
        System.out.println(temp);

    }
}
