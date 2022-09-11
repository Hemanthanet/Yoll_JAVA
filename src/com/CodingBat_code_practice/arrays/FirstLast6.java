package com.CodingBat_code_practice.arrays;

public class FirstLast6 {
    public static void main(String[] args) {
        /*
        Given an array of ints, return true if 6 appears as either the first or last element in the array.
        The array will be length 1 or more.
         */
        int arr[]={4,5,4,6,9,3,2,9,10,6};   //index == 10
        System.out.println("index = "+arr.length);
        System.out.println(arr.length-1); //this is the index because index starts from zero and if we need to accept last index of  array  we need to add length-1
        boolean sixFound=false;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[0]==6 || arr[arr.length-1]==6){
                sixFound=true;
                //continue;
            }

        }
        System.out.println(sixFound);
    }
}
