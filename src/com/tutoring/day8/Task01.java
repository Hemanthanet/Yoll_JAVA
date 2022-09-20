package com.tutoring.day8;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //write a method to find out if given string  is palindrome using recursions
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word: ");
        System.out.println(isPalindromeRecursion(in.next()));

    }

    public static boolean isPalindromeRecursion ( String word ) {
      if(word.isEmpty() || word.length()==1) //base case in very first checked  ex: deed >> ee >>  ""
      {
          return true;
      }
      if(word.charAt(0)!=word.charAt(word.length()-1)) // racecar --> r and r removed  r and r si similar
      {
          return false;
      }


      return isPalindromeRecursion(word.substring(1, word.length()-1));

        //		  true -> isPal("e")   ->  isPal("cec")  -> isPal("aceca")  -> isPalindrome("racetcar")
//		  false -> isPal("et")   ->  isPal("cec")  -> isPal("aceca")  -> isPalindrome("racetcar")
//	 racecar  >> aceca  >> cec >> e
//	deed >> ee >>  ""
    }


    public static String reverse(String str) {
        if(str.length()==1) {
            return str;
        }

        return str.substring(str.length()-1)+reverse(str.substring(0,(str.length()-1)));
    }

    public static boolean isPalindrome(String str) {
        return reverse(str).equals(str);

    }
}
