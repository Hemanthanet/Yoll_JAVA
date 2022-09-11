package com.company;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String userString= "Success if bound to happen when you believe.";
        String new_userinput=userString.replaceAll("\\s","");
        int sentence_lenth= new_userinput.length();
        System.out.println(sentence_lenth);


        //

        String str = "Success is bound to happen when you believe.";

        String s=str.replace(" ","");
        System.out.println(s.length());

        //
        String str2 = "Success is bound to happen when you believe.";
        String str1 = str.replace(" ", "");
        System.out.println(str2.length());








        }





    }

