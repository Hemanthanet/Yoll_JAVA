package com.tutoring.day6;

public class FindMaxAndMin {
    public static void main(String[] args) {

        /**
         * Find min and max values in an array.
         */

        int[] arr = {99, 5, 77, 4, 1, 55, 80, 34, 7, -4};

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){

                if(min>arr[i])
                {
                    min=arr[i];
                }
                if(max<arr[i])
                {
                    max=arr[i];
                }

        }

        System.out.println( "Max " + max);
        System.out.println("Min "+ min);
    }
}
