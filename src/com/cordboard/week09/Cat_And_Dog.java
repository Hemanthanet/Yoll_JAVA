package com.cordboard.week09;

import java.util.Scanner;

public class Cat_And_Dog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //Write Your code here
        /*
        Example:
                input: catdog
                output: true

                Example:
                input: catcat
                output: false

                Example:
                input: cat-cheetah-dog-cat
                output: false
         */
//        System.out.println("cat count "+ countCat(word));
//        System.out.println("dog count "+ countDog(word));

        //has dog? has?

        if(!word.isEmpty() && word.contains("dog") && word.contains("cat") && word.startsWith("cat")){
            if(countCat(word)==countDog(word))
            {
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }else {
            System.out.println(false);
        }
    }



    public static int countDog(String str) {
        String findStr = "dog";
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        return count;
    }

    public static int countCat(String str) {
        String findStr = "cat";
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
       return count;
    }
}
