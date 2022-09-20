package com.cordboard.week08;

import java.util.Scanner;

public class Build_A_Route {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        // Your code here
        //method calls here
        System.out.println(showPath(start, end));



    }

    //ends of main method



    // this method checked all the occurence with  on element  for example : A with AB,AC,AD and AA
    private static String showPath(String start, String end) {
        String route = "";
        String left = "left";
        String right = "right";
        String down = "down";
        String up = "up";
        String found=": "+end.toUpperCase()+" found";
        String sameFound=end.toUpperCase()+" found";

        if (start.equalsIgnoreCase("A")) {


            if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")) {
                route = right+found;
            } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")) {
                route = right + " > " + down+found;
            } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")) {
                route = right + " > " + down +" > "+ left+found;
            }else
            {
                route=sameFound;
            }
        }

        //if Starts from B

        if (start.equalsIgnoreCase("B")) {


            if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")) {
                route = down+found;
            } else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D")) {
                route = down + " > " + left+found;
            } else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")) {
                route = down + " > " + left + up+found;
            }
            else
            {
                route=sameFound;
            }
        }

        //if starts from C
        if (start.equalsIgnoreCase("C")) {


            if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D")) {
                route = left+found;
            } else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A")) {
                route = left + " > " + up+found;
            } else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B")) {
                route = left + " > " + up + right+found;
            }
            else
            {
                route=sameFound;
            }
        }

        //if starts from D
        if (start.equalsIgnoreCase("D")) {
            //if A/B

            if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A")) {
                route = up+found;
            } else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B")) {
                route = up + " > " + right+found;
            } else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("C")) {
                route = up + " > " + right + down+found;
            }
            else
            {
                route=sameFound;
            }

        }

        return route;
    }
}



