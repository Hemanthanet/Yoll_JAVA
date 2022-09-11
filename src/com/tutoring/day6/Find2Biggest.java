package com.tutoring.day6;

public class Find2Biggest {
    public static void main(String[] args) {
        /**
         * Find 2 biggest values in array
         */

        int[] arr = { 5,7,8,55, 77, -4, 2, 1, 0};
        int max = arr[0];
        int secondMax = arr[0];

        for( int num : arr) {
            if(max < num) {
                secondMax = max;
                max = num;
            }else if(secondMax < num) {
                secondMax = num;
            }
        }
        System.out.println("First Max Number: " + max);
        System.out.println("Second Max Number: " + secondMax);



    }
}
