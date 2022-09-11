package com.CodingBat_code_practice;

import javax.sound.midi.Soundbank;

public class NonStart {
    public static void main(String[] args) {
        /*Given 2 strings, return their concatenation, except omit the first char of each.
        The strings will be at least length 1.
            Ex:
            nonStart("Hello", "There") → "ellohere"
            nonStart("java", "code") → "avaode"
            nonStart("shotl", "java") → "hotlava"
         */
            String a="Hemantha";
            String b="Priyangika";

            String newString="";
            if(a.length()>=1 && b.length()>=1){
             newString=a.substring(1,a.length())+b.substring(1,b.length());
            System.out.println(newString);
        }

    }
}
