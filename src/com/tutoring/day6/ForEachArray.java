package com.tutoring.day6;

import java.util.Arrays;

public class ForEachArray {
    public static void main(String[] args) {
        /**
         * this is the way  how to revers an array using for loop
         */
        int[] arr = {4,5,6,7,8,9,10};

        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }



        /**
         * Loop backwards with for each loop
         */

        //int[] arr = {4,5,6,7,8,9,10};
        int arr_new[]=new int[arr.length];
        int count=arr.length-1;

        for(int num : arr) {
            arr_new[count]=num;
            count--;

        }
        System.out.println(Arrays.toString(arr_new));



        /*
        * other way
         */


        //initialization
        int i=arr.length-1;

        for(int num2:arr){
            //assign new  value to num2
            num2=arr[i];
            System.out.print(num2 + " ");
            //decrement
            i--;
        }










    }
}
