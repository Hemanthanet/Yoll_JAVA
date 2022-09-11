package com.tutoring.day5;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String text = scan.nextLine();
        String [] words = text.split("\\s");    //""
        System.out.println(Arrays.toString(words));
        String finalResult = "";

        for(int i=0; i<words.length ; i++) {
            String element = words[i];
//			if(element.equals("")) {
//				continue;
//			}
            element = element.substring(0, 1).toUpperCase() + element.substring(1).toLowerCase();
            finalResult+=element+" ";
        }
        System.out.println(finalResult);


    }
}
