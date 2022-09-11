package com.tutoring.day5;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {

        /**
         * Get string inputs from the user: short and longer input
         * Count how many times that short string occurs in longer one
         */

//		cat    aacat
//		3       5             5-3 =2

        Scanner in = new Scanner(System.in);
        System.out.println("Enter short word: ");
        String shortWord = in.next();
        System.out.println("Enter longer word: ");
        String longWord = in.next();
        int counter = 0;
        for(int i = 0 ; i<=longWord.length()-shortWord.length();i++ ) {
            if(longWord.substring(i, i+shortWord.length()).equals(shortWord)) {
                counter++;
            }

        }
        System.out.println(counter);

    }
}
