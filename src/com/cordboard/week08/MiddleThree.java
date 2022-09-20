package com.cordboard.week08;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        getMiddleThreeLetters(word);

    }

    private static void getMiddleThreeLetters(String word){
        String newString="";
        if(word.length()>=5  && word.length()%2!=0){
            int length=word.length();
            int middle=(length)/2;
            System.out.println(word.substring(middle-1, middle+2));
        }else
        {
            System.out.println("invalid");
        }
        System.out.println(newString);
    }

}
