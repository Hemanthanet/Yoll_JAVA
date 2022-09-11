package com.cordboard;

import java.util.Scanner;

public class Quizes {
    public static void main(String[] args) {

        /*
        what is the farthest planet in the solar system:

a)venus

b)pluto

c)neptun
         */

        Scanner s=new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("\t\ta)venus");
        System.out.println("\t\tb)pluto");
        System.out.println("\t\tc)neptun");

        System.out.println("Enter your answer as a or b or c ");
        String a=s.nextLine();

        //Write your code here

            if(a.equals("a"))
            {
                System.out.println(a+" is wrong");
            }else if(a.equals("b"))
            {
                System.out.println(a+" is correct");
            }else if(a.equals("c"))
            {
                System.out.println(a+" is wrong");
            }else{
                System.out.println( a+" is not a valid answer");
            }

    }
}
