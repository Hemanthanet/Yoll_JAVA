package com.cordboard.other_weeks;

import java.util.Scanner;

public class FirstHalf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                String word = scan.next();
        String output="";
        if(word.length()%2!=0) //odd
        {
            int halfEle=(word.length()-word.length()%2)/2;
            output=word.substring(0, halfEle);

        }
        else
        {
            output=word.substring(0, word.length()/2);

        }
        System.out.println(output+output);

    }
}
