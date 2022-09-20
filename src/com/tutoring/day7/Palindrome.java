package com.tutoring.day7;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // crate a method that check if given string is palindrome

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word: ");
        System.out.println(isPalindrome(in.next()));
        System.out.println(isPalindrome2(in.next()));

    }

    public static boolean isPalindrome ( String word ) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    public static boolean isPalindrome2 ( String word ) {
        int i=0;  int j=word.length()-1;
        while (i<j)
        {
            if(word.charAt(i)!=word.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;


    }

}
