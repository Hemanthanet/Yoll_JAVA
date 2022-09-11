package com.company.module04_loops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ReverseYourName {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your name  :");
        String name =scn.next();
        char charArr[]=name.toCharArray();
        System.out.println("using revers Char Array ");
        System.out.println();
        for(int i =charArr.length-1;i>=0;i--)
        {
            System.out.print(charArr[i]);
        }
        System.out.println();
        System.out.println("using revers String array ");
        String[] arrName=name.split("");
        for(int j=arrName.length-1;j>=0;j--){
            System.out.print(arrName[j]);
        }


    }
}
