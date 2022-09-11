package com.cordboard;

import java.util.Scanner;

public class LargerStringFind {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();


        //Write Your Code Here
        int word1len=word1.length();
        int word2len=word2.length();

        if(word1len>word2len){
            System.out.println(word1+"  is the largest word ");
        }
        else
        {
            System.out.println(word2+"  is the largest word ");
        }


    }
    }

