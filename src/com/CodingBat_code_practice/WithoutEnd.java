package com.CodingBat_code_practice;

public class WithoutEnd {
    public static void main(String[] args) {
        /*

Given a string, return a version without the first and last char,
 so "Hello" yields "ell". The string length will be at least 2.
         */

        String str="AppleSamsung";
        if(str.length()>2) {
            String removeFirst = str.substring(1, str.length() - 1);
            System.out.println(removeFirst);
        }
    }
}
