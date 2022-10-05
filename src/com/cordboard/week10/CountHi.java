package com.cordboard.week10;

import java.util.Scanner;

public class CountHi {

/*
            Instructions from your teacher:
            Print out the number of times that the string "hi" appears anywhere in the given string.
            Example:
            input: abc hi how hi
            output: 2
            Example:
            input: hi code java please
            output: 1
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // Your code here
        int countOfHi=0;
        String findText="hi";

        for (int i = 0; i <= str.length()-findText.length(); i++) {
            if(str.substring(i, findText.length()+i).equals(findText)){
                countOfHi++;
            }
        }
        System.out.println("Hi Count " + countOfHi);





    }
}
