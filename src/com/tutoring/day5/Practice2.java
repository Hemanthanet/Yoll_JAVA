package com.tutoring.day5;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = sc.nextLine();

        //reverse a string

       /*
        String word = sc.nextLine();
        String rev="";
        for(int i=word.length()-1;i>=0;i--) {
            rev+=word.charAt(i);
        }
        System.out.println(rev);

*/

        //another method
        String result="";
        char[] chars= word.toCharArray();


        for(int i=chars.length-1;i>=0;i--)
        {
            result+=chars[i];
        }
        System.out.println(result);
    }
}
