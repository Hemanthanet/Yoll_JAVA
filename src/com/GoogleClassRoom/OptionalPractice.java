package com.GoogleClassRoom;

import java.util.Arrays;

public class OptionalPractice {
    public static void main(String[] args) {
        /*
        1. Create an array that contains numbers: 75, 30, 120, 4, 194, 222, 9;
        2. Print the array
        3. Print the array elements each in new line
        4. Print only the numbers that are bigger than 100
        5. Print the count of numbers that are bigger than 100
        6. Print sum of the numbers in the array.
        7. Print average value in the array.
         */

        int numArray[]={75, 30, 120, 4, 194, 222, 9};

        //print array
        System.out.println(Arrays.toString(numArray));

        System.out.println("-----------------------------");


        //print all elements each in new line

        for(int arrElements: numArray){
            System.out.println(arrElements);
        }
        System.out.println("-----------------------------");
        // print bigger than elements

        System.out.println("more than 100 elements are :");
        for(int arrElements: numArray){

            if(arrElements>100) {
                System.out.println(arrElements);
            }
        }
        System.out.println("-----------------------------");

        //Print the count of numbers that are bigger than 100
        int count=0;
        for(int arrElements: numArray){

            if(arrElements>100) {
                count++;
            }
        }
        System.out.println("More than 100 elements : "+count);

        System.out.println("-----------------------------");


        //Print sum of the numbers in the array.
        int sum=0;
        for(int arrElements: numArray){
            sum+=arrElements;

        }
        System.out.println("Sum is  : " + sum);

        System.out.println("-----------------------------");

        //Print average value in the array.
        double average = sum/numArray.length;
        System.out.println("Average is  :"+ average);

        System.out.println("-----------------------------");

    }
}
