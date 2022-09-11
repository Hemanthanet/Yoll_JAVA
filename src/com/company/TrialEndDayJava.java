package com.company;

import java.util.Scanner;

public class TrialEndDayJava {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        System.out.println("Enter your Number ");
//        int num=scn.nextInt();
//
//        if(num%2==0){
//            System.out.println(num+ "number is EVEN");
//        }
//        else {
//            System.out.println(num+ "number is ODD");
//        }


      //grade converter
        System.out.println("Enter the grade ");
        int score=scn.nextInt();
        if(score<=100 && score>=90){
            System.out.println("grade is A");
        }else if (score<90 && score>=80)
        {
            System.out.println("grade is B");
        }else if (score<80 && score>=70)
        {
            System.out.println("grade is C");
        }else if (score<70 && score>=50)
        {
            System.out.println("grade is D");
        }
        else
        {
            System.out.println("grade is F");
        }



    }
}
