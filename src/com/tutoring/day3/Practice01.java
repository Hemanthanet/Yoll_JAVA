package com.tutoring.day3;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter your word");
        String in= scn.next();
        /* method one


        char prefix='H';
        if(in.charAt(0)==prefix)
        {
            System.out.println("Start with " + prefix);
        }
        else
        {
            System.out.println("It's not start with " + prefix);
        }

         */

        //method 02


        //char+ ""  equals to  String  >>> converted to String so to  we need to add "" to char -- to string  to use equal

        char prefix='H';
        if((in.charAt(0)+"").equals(prefix+""))
        {
            System.out.println("it's "+prefix);
        }
        else
        {
            System.out.println("Its not " + prefix);
        }

        if(in.indexOf(prefix)==0){
            System.out.println("Letter is "+ prefix);
        }else
        {
            System.out.println("Letter is not "+ prefix);
        }




    }
}
