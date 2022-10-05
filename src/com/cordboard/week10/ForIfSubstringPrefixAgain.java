package com.cordboard.week10;

import java.util.Arrays;
import java.util.Scanner;

public class ForIfSubstringPrefixAgain {

    public static void main(String[] args) {
        /*
            Instructions from your teacher:

            Given a string, consider the prefix string made of the first n chars of the string.
            Does that prefix string appear somewhere else in the string?
            Assume that the string is not empty and that n is in the range from 1 till str.length().

            Example:
            input: abXYabc
            input: 1
            output: true
            a appears twice
            Example:
            input: abXYabc
            input: 2
            output: true
            ab appears twice
            Example:
            input: abXYabc
            input: 3
            output: false
            abX appears once only
         */

        Scanner scan = new Scanner(System.in);
        String str ="abXYabc"; //scan.next();
        int n = scan.nextInt();


        int count=1;
        boolean hasMoreThanOne=false;
        String positions[]={"once","twice","tries"};

        if(str.length()<n){
            System.out.println("Failed");
        }else
        {
            int init=str.substring(0, n).length();
            for (int i = 0; i <str.length(); i++) {     // [0] [1] /[2] [3] [4]
                for (int j = n; j <str.length() ; j++) {
                    if(str.substring(0, n).equals(str.substring(i, i+n))){
                        count++;
                    }
                }



            }
            if(count>1){
                hasMoreThanOne=true;
                System.out.println(hasMoreThanOne);
                //a appears twice
                System.out.println(str.substring(0, n)+" appears "+positions[count-1]);
            }else
            {
                System.out.println(hasMoreThanOne);
                //abX appears once only
                System.out.println(str.substring(0,n)+" appears once only");
            }

        }


    }
}
