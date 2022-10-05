package com.cordboard.week10;

import java.util.Scanner;

public class ForIfSubstringPrefixAgainNew {

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
        String str = scan.next();
        int n = scan.nextInt();

        boolean is_a_prefix = false;
        int prefix_count = 0;
        int i = 0;
        String outputText="";
        String places[]={"once","twice","tries"};

        while (i <= str.length() - n) {
            if (str.substring(i, (i + n)).equals(str.substring(0, n))) {
                is_a_prefix = true;
                prefix_count += 1;
            } else {
                is_a_prefix = false;
            }

            i++;

        }


        if (prefix_count > 1) {
            is_a_prefix = true;
            outputText=str.substring(0, n)+" appears "+places[prefix_count-1];
        }else {
            outputText=str.substring(0, n)+" appears "+places[0]+" only";
        }
        System.out.println(is_a_prefix);
        System.out.println(outputText);
    }
}
