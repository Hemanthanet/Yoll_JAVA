package com.company.module04_loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        int count=scn.nextInt();
        int i=1;
        int sum=0;
        while (i<100)
        {
            i++;
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
