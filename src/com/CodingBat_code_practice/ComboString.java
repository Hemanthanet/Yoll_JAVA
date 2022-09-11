package com.CodingBat_code_practice;

/*
Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
 */

public class ComboString {
    public static void main(String[] args) {

        String a="Hemantha";
        String b="Pushpa_Kumara_Jayasundara";
        String format;
        if(a.length()>b.length())
        {
            format=b+a+b;
        }
        else{
            format=a+b+a;
        }
        System.out.println(format);
    }
}
