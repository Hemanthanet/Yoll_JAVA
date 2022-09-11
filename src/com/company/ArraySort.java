package com.company;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        // Arrays.toString()
        int[] nums = {1, 3, 4, 5, 6};

        double[] temps = {12.5, 66.8, 99.0};

        String[] arr = {"One", "Two", "Three"};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(temps));
        System.out.println(Arrays.toString(arr));

        // Arrays.sort();
        // It sorts the array in ascending order
        String[] fruit = {"Plum", "Orange", "Apple", "Pear"};
        System.out.println("Before sort" + Arrays.toString(fruit));
        Arrays.sort(fruit);
        System.out.println("After sort" + Arrays.toString(fruit));
        Arrays.sort(fruit, Collections.reverseOrder());
        System.out.println("After sort" + Arrays.toString(fruit));

        // sort an int array

        // Ascending order
        Integer[] nums2 = {3, 6, 9, 5, 4, -1};
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
        // Descending order
        Arrays.sort(nums2, Collections.reverseOrder());
        Arrays.sort(nums2,Collections.reverseOrder());


        //multidimentional array
        int [][] num={  {10,20,30},
                        {23,56,70},
                        {23,56,70},
                     };

        System.out.println(num.length);
        System.out.println(Arrays.deepToString(num));
    }
}








