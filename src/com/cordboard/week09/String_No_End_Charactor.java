package com.cordboard.week09;

import java.util.Scanner;

public class String_No_End_Charactor {

    /*
    Instructions from your teacher:
        In this exercise you get a string called txt .
        output txt without its last letter.
        for example:
        txt = "foo"
        output will be:
        fo
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        System.out.println(noEndChar(txt));




    }

     static String noEndChar(String txt)
    {

        if(txt != null || txt.length() != 0)
        {
            return txt.substring(0, txt.length() - 1);

        }
        return null;
    }
}
