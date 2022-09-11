package com.tutoring.day3;

import java.util.Scanner;

public class UppercaseLowerCase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String userText=scn.nextLine();
        String trimmed= userText.trim();//char
        String firstName=trimmed.substring(0,1).toUpperCase()+trimmed.substring(1,trimmed.indexOf( " ")).toLowerCase();
        String lastName=trimmed.substring(trimmed.lastIndexOf(" ")+1,trimmed.lastIndexOf(" ")+2).toUpperCase() + trimmed.substring(trimmed.lastIndexOf(" ")+2).toLowerCase();

        System.out.println(firstName  + " " + lastName);

    }
}
