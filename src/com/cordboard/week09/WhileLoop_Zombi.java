package com.cordboard.week09;

import java.util.Scanner;

public class WhileLoop_Zombi {
    /*
    Instructions from your teacher:

A variable inhabitants represents population of a city.
City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
After each day, a city will lose half of its population.write a program to loop the city population and make it lose half of its population until no humans left.
Print the each day like below for each day:
Hint: you might consider creating two int variables, inhabitants and days...

example1- inhabitants is 6
Day 0 -> 6
Day 1 -> 3
Day 2 -> 1
---- EXTINCT ----
example2- inhabitants is 0
---- EXTINCT ----
example3- inhabiants is 20
Day 0 -> 20
Day 1 -> 10
Day 2 -> 5
Day 3 -> 2
Day 4 -> 1
---- EXTINCT ----
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants =scan.nextInt();
        int days=0;

        while(inhabitants>0){
            System.out.println("Day "+days+" -> "+inhabitants);
            days++;
            inhabitants=inhabitants/2;

        }
        System.out.println("---- EXTINCT ----");
    }



}
