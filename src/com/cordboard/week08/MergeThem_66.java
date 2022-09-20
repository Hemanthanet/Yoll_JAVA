package com.cordboard.week08;

import java.util.Arrays;
import java.util.Scanner;

public class MergeThem_66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

         char[] merge=new char[6];
        if(word1.length()==3 && word2.length()==3)
        {

            String new_word="";
            for(int i=0;i<3;i++)
            {

                new_word+=word1.charAt(i)+""+word2.charAt(i); // combined both of string's  similar indexes
            }
            System.out.println(new_word);
        }
        else
        {
            System.out.println("cannot merge");
        }


    }
}
