package com.cordboard.week10;

public class MethodHeaderPractice_3_38 {
    /*
     Write a method header (public static) on line two with the following specs:
            Returns: a String
            Name: makeCapital
            Parameters: a String named "name"
            You should not be writing code on any line other than #2
     */

    //Your code here
    public static String makeCapital(String name){
        return name.toUpperCase();
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(makeCapital("test"));
    }
}
