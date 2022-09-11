package com.company.module04_loops;

public class PracticeLoop {
    public static void main(String[] args) {
        /*
        Print all the values of below array in using nested for loops
        nested for each loop
        String apps[][] = {
        { "Facebook", "Instagram", "Twitter", "Youtube" },
                        { "Bank of America", "TD Bank", "Chase", "Wells Fargo" },
                        { "Hotels", "AirBnb", "Expedia" }
 };
         */

        String apps[][] = {
                {"Facebook", "Instagram", "Twitter", "Youtube"},
                {"Bank of America", "TD Bank", "Chase", "Wells Fargo"},
                {"Hotels", "AirBnb", "Expedia"}
                        };



        System.out.println("------------------using for loop--------------------");


        for(int i=0;i<apps.length;i++){
            for(int j=0;j<apps[i].length;j++){
                System.out.println(apps[i][j]);
            }
        }

        //we can use enhanced loop
        System.out.println("------------------using enhanced loop--------------------");

        for(String [] eachArray: apps)
        {
            for(String eachApp:eachArray)
            {
                System.out.println(eachApp);
            }
        }

    }
}
