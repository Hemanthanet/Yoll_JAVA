package com.company;

import java.sql.SQLOutput;

public class JavaQuiz {
    public static void main(String[] args) {

        String str = "Hemantha";
        int  lastInde=str.length()-1;
        int lastInde2=str.length()-2;
        System.out.println(str.charAt(lastInde) +""+ str.charAt(lastInde2));

        //solution 2

        String end =str.substring(str.length()-2);
        System.out.println(end+end+end);

        /*
        Given a string, return the string made of its first two chars,
        so the String "Hello" yields "He". If the string is shorter than length 2,
        return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
        Note that str.length() returns the length of a string.
         */


            String output;
            if(str.length()>=2){
                output=str.substring(0,2);
            }else if( str.isEmpty())
            {
                output="";
            }
            else
            {
                output=str;
            }
        System.out.println(output);

            //here is the best solution
        /*
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }

         */







    }
    }





