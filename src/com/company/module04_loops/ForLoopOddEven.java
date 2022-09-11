package com.company.module04_loops;

import java.util.Scanner;

public class ForLoopOddEven {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter the number : " + i);
            int num = scn.nextInt();
            if(num%2==0)
            {
                System.out.println("number "+ num + "even ");
            }else
            {
                System.out.println("number "+ num + "odd ");
            }

        }
    }
}
