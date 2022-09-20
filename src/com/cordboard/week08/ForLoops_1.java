package com.cordboard.week08;

import java.util.Scanner;

public class ForLoops_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int end = inp.nextInt();
        //write your code below
        if(end>=1){
            for (int i=1;i<=end;i++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
