package com.CodingBat_code_practice.arrays;

public class SameFirstLast {
    public static void main(String[] args) {
        /*
        Given an array of ints, return true if the array is length 1 or more,
        and the first element and the last element are equal.
         */
        int nums[]={1,5,4,3,6,3,2};
        boolean isEqual=false;
        if(nums.length>=1){
            if(nums[0]==nums[nums.length-1])
            {
                isEqual=true;
            }
        }
        System.out.println(isEqual);
    }
}
