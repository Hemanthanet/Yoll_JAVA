package com.tutoring.day6;

public class SearchArray {
    public static void main(String[] args) {
        //array
        /**
         * Find if any element occurs 2 times in the array.
         */

        String [] arr = {"aa", "bb", "cc", "bb", "qq", "ee", "ee"};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    System.out.println(arr[j]);
                }
            }
        }



        //others










    }
}
