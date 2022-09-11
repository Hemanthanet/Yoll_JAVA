package com.tutoring.day5;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //     1.  Reverse a number with string methods
//	   2.  Reverse a number without using string methods only with arithmetic operations

//	    String numAsStr = String.valueOf(number);
//
//	    char[]  chars = numAsStr.toCharArray();
//	    String result="";
//
//	    for(int i=chars.length-1 ; i>=0; i--) {
//	    	result += chars[i];
//	    }
//
//	    System.out.println(result);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

//		x / y = z (r)       x = y * z +r
//		72 / 10 = 7 (2)     72 = 10 * 7 +2
//		7/10 = 0 (7)        7 = 0 *10 + ?

        int reversed = 0;
        while (num != 0) {
            reversed = (reversed * 10) + num % 10;
            num /= 10;
        }
        System.out.println(reversed);

    }
}
